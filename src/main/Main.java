package main;

import main.parser.Parser;
import main.parser.grammar.JavaGrammarLexer;
import main.parser.grammar.JavaGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) {
        String input = "void main() {\n" +
                "x = 5;\n" +
                "}";

        Parser parser = new Parser(input);
    }
}
