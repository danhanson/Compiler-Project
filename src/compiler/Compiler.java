package compiler;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;

import parser.MiniJavaErrorStrategy;
import parser.MiniJavaLexer;
import parser.MiniJavaParser;
import parser.MiniJavaParser.ClassDeclContext;
import parser.MiniJavaParser.ProgContext;
import typechecker.scope.GlobalScope;
import typechecker.types.Class;

public class Compiler {

	public static void main(String[] args) throws IOException {
		if(args.length < 2){
			System.err.println("file argument and output directory required");
			return;
		}
		CharStream in = new ANTLRFileStream(args[0]);
		Path output = FileSystems.getDefault().getPath(args[1]);
		MiniJavaLexer lexer = new MiniJavaLexer(in);
		TokenStream tokens = new BufferedTokenStream(lexer);
		MiniJavaParser parser = new MiniJavaParser(tokens);
		parser.setErrorHandler(new MiniJavaErrorStrategy());
		parser.setBuildParseTree(true);
		ProgContext tree = parser.prog();
		GlobalScope global = GlobalScope.instance();
		for(ClassDeclContext classDec : tree.classDecl()){
			GlobalScope.instance().addType(Class.fromClassDecl(classDec, global));
		}
		if(global.checkTypes()){
			global.generateCode();
			global.writeCode(output);
			System.out.println("Success!");
		}
	}
}
