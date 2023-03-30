package org.example;

import com.sun.jdi.IntegerValue;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindowOperator {
    static JLabel label = new JLabel("", SwingConstants.RIGHT);
    static String mainText = "";
    static int width = 300;
    static int height = 90;

    public static JPanel returnJPanel() {
        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 310, 100);
        panel.setBackground(new Color(170, 170, 170));

        //label settings
        panel.add(label);
        label.setMinimumSize(new Dimension(width, height));
        label.setPreferredSize(new Dimension(width, height));
        label.setMaximumSize(new Dimension(width, height));
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        return panel;
    }

    public static void changeText(String text) {
        label.setFont(new Font("Serif", Font.PLAIN, 40));

        mainText += text;
        Math.getText(mainText);
        Math.returnResult();
        label.setText(mainText);



    }

}
