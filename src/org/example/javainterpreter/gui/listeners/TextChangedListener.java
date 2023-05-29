package org.example.javainterpreter.gui.listeners;

import org.example.javainterpreter.Main;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextChangedListener implements TextListener {

    @Override
    public void textValueChanged(TextEvent e) {
        Main.instance.gui.codeChanged();
    }
}
