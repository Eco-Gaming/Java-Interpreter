package org.example.javainterpreter;

import org.example.javainterpreter.gui.GUI;
import org.example.javainterpreter.parser.Parser;

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
    }
}
