package main.parser;

import main.parser.grammar.JavaGrammarLexer;
import main.parser.grammar.JavaGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Parser {

    JavaGrammarLexer lexer;
    CommonTokenStream tokenStream;
    JavaGrammarParser parser;

    String tokenString;

    public Parser(String input) {
        lexer = new JavaGrammarLexer(CharStreams.fromString(input));
        tokenStream = new CommonTokenStream(lexer);
        parser = new JavaGrammarParser(tokenStream);

        tokenString = "";
    }

    public String generateTokenString() {
        tokenString = "";
        for (int i = 0; i < tokenStream.getNumberOfOnChannelTokens(); i++) {
            String tokenText = tokenStream.get(i).getType() + ":" + "token-name" + ":" + tokenStream.get(i).getText();
            tokenString = tokenString + tokenText + "\n";
        }
        return tokenString;
    }

    public void parse() {
        parser.methode();
    }
}
