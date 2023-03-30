package org.example;

import javax.swing.*;

public class Window extends JFrame {
    //-tworzenie okienka
    Window() {
        this.setSize(350, 470);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        addButtons();
        this.add(CalculatorWindowOperator.returnJPanel());
    }

    //-tworzenie przycisków
    void addButtons() {
        String[][] tab =
                {
                        {"CE", "√", "%"},
                        {"7", "8", "9"},
                        {"4", "5", "6"},
                        {"1", "2", "3"},
                        {"0", ".", "="}
                };
        String[] tab2 = {"/", "x", "-", "+"};
        int x = 10, y = 150, width = 75, height = 50;

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 2; j++) {
                this.add(ButtonOperator.returnButton(x, y, width, height, tab[i][j]));
                x += width + 5;
            }
            x = 10;
            y += height + 5;
        }

        x = 10 + ((width + 5) * 3);
        y = 150;

        for (int k = 0; k <= 2; k++) {
            this.add(ButtonOperator.returnButton(x, y, width, height, tab2[k]));
            y += height + 5;
        }
        this.add(ButtonOperator.returnButton(x, y, 75, 105, tab2[3]));
    }
}
