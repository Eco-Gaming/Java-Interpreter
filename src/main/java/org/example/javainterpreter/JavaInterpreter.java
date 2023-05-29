package org.example.javainterpreter;

import org.example.javainterpreter.gui.GUI;
import org.example.javainterpreter.parser.Parser;

public class JavaInterpreter {

    public static JavaInterpreter instance;

    public Parser parser;
    public GUI gui;

    public JavaInterpreter() {
        parser = new Parser();
        gui = new GUI(this);
    }

    public static void main(String[] args) {
        instance = new JavaInterpreter();

        instance.gui.startGUI();
    }
}
