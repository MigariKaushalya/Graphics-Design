/*
 DAY 13 - SCALING
 x' = sx*x
 y' = sy*y
*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Day13_Scaling extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(40, 70, 80, 50);
        AffineTransform old = g2.getTransform();
        g2.translate(220, 70);
        g2.scale(2.0, 1.5);
        g2.drawRect(0, 0, 80, 50);
        g2.setTransform(old);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 13");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450, 250);
        f.add(new Day13_Scaling());
        f.setVisible(true);
    }
}
