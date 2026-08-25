/*
 DAY 12 - TRANSLATION
 Translation moves every point:
 x' = x + tx
 y' = y + ty
*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Day12_Translation extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(50, 80, 100, 70);
        AffineTransform old = g2.getTransform();
        g2.translate(220, 80);
        g2.drawRect(0, 0, 100, 70);
        g2.setTransform(old);
        g2.drawString("Original", 60, 180);
        g2.drawString("Translated", 220, 180);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 12");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450, 250);
        f.add(new Day12_Translation());
        f.setVisible(true);
    }
}
