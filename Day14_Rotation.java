/*
 DAY 14 - ROTATION
 x' = x cos(theta) - y sin(theta)
 y' = x sin(theta) + y cos(theta)
*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Day14_Rotation extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(60, 80, 120, 60);

        AffineTransform old = g2.getTransform();
        g2.translate(340, 120);
        g2.rotate(Math.toRadians(35));
        g2.drawRect(-60, -30, 120, 60);
        g2.setTransform(old);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 14");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(480, 260);
        f.add(new Day14_Rotation());
        f.setVisible(true);
    }
}
