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
    String tokenList;

    public Parser(String input) {
        lexer = new JavaGrammarLexer(CharStreams.fromString(input));
        tokenStream = new CommonTokenStream(lexer);
        parser = new JavaGrammarParser(tokenStream);

        errorListener = new CustomErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        tokenString = "";
        tokenList = "";
    }

    public String generateTokenString() {
        tokenString = "";
        for (int i = 0; i < tokenStream.getNumberOfOnChannelTokens(); i++) {
            String tokenText = Integer.toString(tokenStream.get(i).getType());
            if (tokenText.equals("-1")) tokenText = "EOF";
            tokenString = tokenString + tokenText + "->";
        }
        tokenString = tokenString.substring(0, tokenString.length()-2);
        return tokenString;
    }

    public String generateTokenList() {
        tokenList = " 1 - KLAMMERAUF     - (\n 2 - KLAMMERZU      - )\n 3 - BLOCKAUF       - {\n 4 - BLOCKZU        - }\n 5 - WENN           - if\n 6 - SONST          - else\n 7 - SOLANGE        - while\n 8 - ZUWEISUNGSOP   - =\n 9 - SEMIKOLON      - ;\n10 - VERGLEICHSOP   - ==,!=,<,>,<=,>=\n11 - STRICHOPERATOR - +,-\n12 - PUNKTOPERATOR  - *,/\n13 - TYP            - void,String,int\n14 - NAME           - [a-z]+\n15 - ZAHL           - [0-9]+";
        return tokenList;
    }

    public String generateOldTokenString() {
        String oldTokenString = "";
        for (int i = 0; i < tokenStream.getNumberOfOnChannelTokens(); i++) {
            String tokenText = tokenStream.get(i).getType() + ":" + "token-name" + ":" + tokenStream.get(i).getText();
            oldTokenString = oldTokenString + tokenText + "\n";
        }
        oldTokenString = oldTokenString.substring(0, oldTokenString.length()-1);
        return oldTokenString;
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