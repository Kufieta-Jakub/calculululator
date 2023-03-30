package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class ButtonOperator extends JFrame{

    public static JButton returnButton(int x, int y, int width, int height, String name)
    {
        JButton button = new JButton(name);
        button.setBounds(x,y,width,height);
        button.setFocusPainted(false);
        button.setVisible(true);
        button.setContentAreaFilled( false );
        button.setBorder(new RoundedBorder(25));
        button.addActionListener(e -> CalculatorWindowOperator.changeText(e.getActionCommand()));
        return button;
    }

    private static class RoundedBorder implements Border {

        private final int radius;


        RoundedBorder(int radius) {
            this.radius = radius;
        }


        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }


        public boolean isBorderOpaque() {
            return false;
        }


        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);

        }
    }
}
