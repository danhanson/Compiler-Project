package parser;

import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Trees;

public class Main {

	public static void main(String[] args) throws IOException {
        CharStream in = new ANTLRFileStream(args[0]);
        MiniJavaLexer lexer = new MiniJavaLexer(in);
        TokenStream tokens = new BufferedTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        parser.setErrorHandler(new MiniJavaErrorStrategy());
        System.out.println(Trees.toStringTree(parser.prog(), parser));
	}
}
