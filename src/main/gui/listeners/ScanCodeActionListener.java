package main.gui.listeners;

import main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScanCodeActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Main.instance.gui.scanCode();
    }
}
