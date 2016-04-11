package parser;

import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

public class Main {

	public static void main(String[] args) throws IOException {
        CharStream in = new ANTLRFileStream(args[0]);
        MiniJavaLexer lexer = new MiniJavaLexer(in);
        TokenStream tokens = new BufferedTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        parser.setErrorHandler(new MiniJavaErrorStrategy());
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();
        System.out.println(Trees.toStringTree(tree, parser));
        JFrame f = new JFrame();
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TreeViewer tv = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        f.add(new JScrollPane(tv));
        f.setVisible(true);
	}
}
