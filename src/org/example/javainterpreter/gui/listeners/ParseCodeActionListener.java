package org.example.javainterpreter.gui.listeners;

import org.example.javainterpreter.JavaInterpreter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParseCodeActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JavaInterpreter.instance.gui.parseCode();
    }
}
