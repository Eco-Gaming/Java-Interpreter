package main.parser;

import main.parser.grammar.JavaGrammarLexer;
import main.parser.grammar.JavaGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class Parser {

    JavaGrammarLexer lexer;
    CommonTokenStream tokenStream;
    JavaGrammarParser parser;
    CustomErrorListener errorListener;

    String tokenString;
    boolean valid;

    public Parser(String input) {
        lexer = new JavaGrammarLexer(CharStreams.fromString(input));
        tokenStream = new CommonTokenStream(lexer);
        parser = new JavaGrammarParser(tokenStream);

        errorListener = new CustomErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        tokenString = "";
        valid = true;
    }

    public String generateTokenString() {
        tokenString = "";
        for (int i = 0; i < tokenStream.getNumberOfOnChannelTokens(); i++) {
            String tokenText = tokenStream.get(i).getType() + ":" + "token-name" + ":" + tokenStream.get(i).getText();
            tokenString = tokenString + tokenText + "\n";
        }
        tokenString = tokenString.substring(0, tokenString.length()-1);
        return tokenString;
    }

    public void parse() {
        parser.methode();
    }

    public boolean isValid() {
        return !errorListener.hasErrors();
    }

    public List<String> getErrors() {
        return errorListener.getErrors();
    }

    public int getNumberOfSyntaxErrors() {
        return parser.getNumberOfSyntaxErrors();
    }
}
