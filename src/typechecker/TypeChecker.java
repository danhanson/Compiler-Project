package typechecker;

import java.io.IOException;

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

public class TypeChecker {

	public static void main(String[] args) throws IOException {
		if(args.length == 0){
			System.err.println("file argument required");
			return;
		}
		CharStream in = new ANTLRFileStream(args[0]);
		MiniJavaLexer lexer = new MiniJavaLexer(in);
		TokenStream tokens = new BufferedTokenStream(lexer);
		MiniJavaParser parser = new MiniJavaParser(tokens);
		parser.setErrorHandler(new MiniJavaErrorStrategy());
		parser.setBuildParseTree(true);
		ProgContext tree = parser.prog();
		GlobalScope global = GlobalScope.instance();
		for(ClassDeclContext classDec : tree.classDecl()){
			Class c = Class.fromClassDecl(classDec, global);
			global.addType(c);
		}
		global.resolveTypes();
	}
}
