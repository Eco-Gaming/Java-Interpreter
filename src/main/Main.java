package main;

import main.parser.Parser;

public class Main {

    public static void main(String[] args) {
        String input = "void main() {\n" +
                "x = 5;\n" +
                "}";

        Parser parser = new Parser(input);
    }
}
