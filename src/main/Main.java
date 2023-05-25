package main;

import main.parser.Parser;

public class Main {

    public static Main instance;

    public Parser parser;
    public GUI gui;

    public Main() {
        parser = new Parser();
        gui = new GUI();
    }

    public static void main(String[] args) {

        instance = new Main();

        instance.gui.startGUI();
      
        String input = "void main() {\n" +
                "x = 5;\n" +
                "}";

        instance.parser.setInput(input);
        instance.parser.init();
        instance.parser.parse();

        String tokenString = instance.parser.getTokenString();
        String tokenList = instance.parser.getTokenList();
        boolean isValid = instance.parser.isValid();

        if (!isValid) {
            for (String error : instance.parser.getErrors()) {
                System.err.println(error);
            }
        }
    }
}
