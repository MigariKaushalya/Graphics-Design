/*
 DAY 15 - REFLECTION
 Reflection can flip a shape around an axis.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Day15_Reflection extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("Original", 60, 50);
        g2.drawPolygon(new int[]{60,120,150}, new int[]{100,70,120}, 3);

        AffineTransform old = g2.getTransform();
        g2.translate(300, 0);
        g2.scale(-1, 1);
        g2.drawString("Reflected", -150, 50);
        g2.drawPolygon(new int[]{-60,-120,-150}, new int[]{100,70,120}, 3);
        g2.setTransform(old);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 15");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(480, 220);
        f.add(new Day15_Reflection());
        f.setVisible(true);
    }
}
