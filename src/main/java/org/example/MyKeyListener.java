package org.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
    private final String ALLOWED_CHARS = "123456789/x%√.+-"; // Allowed characters

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (ALLOWED_CHARS.indexOf(c) == -1) { // If the typed character is not allowed
            e.consume(); // Ignore the input
        }
    }

    // Other methods of the KeyListener interface
    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
