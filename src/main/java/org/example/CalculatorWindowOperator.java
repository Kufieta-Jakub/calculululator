package org.example;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindowOperator {
    public static JLabel label = new JLabel("", SwingConstants.RIGHT);
    static JTextField field = new JTextField();


    public static JPanel returnJPanel() {
        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 310, 100);
        panel.setBackground(new Color(170, 170, 170));
        panel.setLayout(null);

        //label settings
        panel.add(label);
        label.setBounds(0,50,310,50);
        //field settings
        panel.add(field);
        field.setBounds(0,0,310,50);
        field.addKeyListener(new MyKeyListener());
        return panel;
    }
    public static JCheckBox checkbox()
    {
        JCheckBox check = new JCheckBox();
        check.addActionListener(e -> {
                    if (check.isSelected()) {
                        System.out.println("wyl");
                        field.setEnabled(false);
                        field.setDisabledTextColor(field.getForeground());
                    }
                    if (!check.isSelected()) {
                        System.out.println("wl");
                        field.setEnabled(true);
                    }
                });
        check.setVisible(true);
        check.setBounds(10,110,30,30);
        return check;
    }
    public static void changeText(String text) {
        try {
            if (text.equals("CE")) {
                String mainText = "";
                field.setText(mainText);
            } else if (text.equals("=")) {
                Mathematic.getMathOperation(field.getText());
                label.setText(Mathematic.oblicznia());
                MemoryOperator.getTextFromField(label.getText());
            } else if (text.equals("√")) {
                label.setText(Mathematic.getSqrtOf(field.getText()));
            } else {
                String mainText = field.getText();
                mainText += text;
                field.setText(mainText);
            }
        }catch(Exception e)
        {
            label.setText("Mordo coś źle wpisałeś");
        }
    }


}

