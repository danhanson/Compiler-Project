package lexerIO;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

public class startStuff {

    public static void main(String[] args) throws IOException {
        CharStream in = new ANTLRFileStream(args[0]);
        MiniJava mj = new MiniJava(in);
        String[] strings = mj.getRuleNames();
        for(Token t = mj.nextToken(); t.getType() != Token.EOF; t = mj.nextToken()){
            String output = strings[t.getType()+2];
            output += ", ";
            output += t.getText();
            System.out.println(output);
        }
    }
}
