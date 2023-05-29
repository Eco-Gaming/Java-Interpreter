package org.example.javainterpreter.gui.listeners;

import org.example.javainterpreter.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScanCodeActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Main.instance.gui.scanCode();
    }
}
