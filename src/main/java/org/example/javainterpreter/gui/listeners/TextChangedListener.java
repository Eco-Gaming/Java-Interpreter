package org.example.javainterpreter.gui.listeners;

import org.example.javainterpreter.JavaInterpreter;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextChangedListener implements TextListener {

    @Override
    public void textValueChanged(TextEvent e) {
        JavaInterpreter.instance.gui.codeChanged();
    }
}
