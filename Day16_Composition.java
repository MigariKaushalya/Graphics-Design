/*
 DAY 16 - COMPOSITE TRANSFORMATIONS
 Transformation order matters.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Day16_Composition extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform old = g2.getTransform();

        g2.translate(250, 150);
        g2.rotate(Math.toRadians(30));
        g2.scale(1.5, 1.5);
        g2.drawRect(-50, -30, 100, 60);

        g2.setTransform(old);
        g2.drawString("Translate -> Rotate -> Scale", 130, 30);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 16");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(520, 330);
        f.add(new Day16_Composition());
        f.setVisible(true);
    }
}
