package parser;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Main {

	public static void main(String[] args) throws IOException {
        CharStream in = new ANTLRFileStream(args[0]);
        MiniJavaLexer lexer = new MiniJavaLexer(in);
        TokenStream tokens = new BufferedTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        printTree(parser, parser.prog(), 0);
	}

	private static void printTree(Parser p, ParseTree con, int depth) {
		if(con instanceof RuleContext){
			RuleContext rule = (RuleContext) con;
			if(con.getChildCount() == 1){
				printTree(p, con.getChild(0), depth);
				return;
			}
			for(int i = 0; i < depth; i++){
				System.out.print(" ");
			}
			System.out.println(p.getRuleNames()[rule.getRuleIndex()]);
			for(int i = 0; i < con.getChildCount(); i++){
				printTree(p, con.getChild(i), depth+1);
			}
		} else if(con instanceof TerminalNode){
			TerminalNode term = (TerminalNode) con;
			Vocabulary v = p.getVocabulary();
			for(int i = 0; i < depth; i++){
				System.out.print(" ");
			}
			System.out.println(v.getDisplayName(term.getSymbol().getType()));
		} else {
			throw new IllegalArgumentException();
		}
	}
}
