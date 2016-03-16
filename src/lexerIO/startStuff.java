package lexerIO;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

public class startStuff {

    public static void main(String[] args) throws IOException {
        CharStream in = new ANTLRFileStream(args[0]);
        MiniJava mj = new MiniJava(in);
        for(Token t = mj.nextToken(); t.getType() != Token.EOF; t = mj.nextToken()){
            System.out.println(t.getText());
        }
    }
}
