package main;

import main.parser.grammar.JavaGrammarLexer;
import main.parser.grammar.JavaGrammarParser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) {
        /*
        TestLexer lexer = new TestLexer(CharStreams.fromString("Hallo John!"));
        TestParser main.parser = new TestParser(new CommonTokenStream(lexer));

        String name = main.parser.main().name().getText();
        */

        String input = "void main() {\n" +
                "x = 5;\n" +
                "";

        JavaGrammarLexer lexer = new JavaGrammarLexer(CharStreams.fromString(input));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JavaGrammarParser parser = new JavaGrammarParser(tokenStream);

        String tokenString = "";
        for (int i = 0; i < tokenStream.getNumberOfOnChannelTokens(); i++) {
            String tokenText = tokenStream.get(i).getType() + ":" + "token-name" + ":" + tokenStream.get(i).getText();
            tokenString = tokenString + tokenText + "\n";
        }

        System.out.println(tokenString);

        parser.methode();

        System.out.println(parser.getNumberOfSyntaxErrors());
        System.out.println(lexer.getState());
    }
}
