/*
 DAY 11 - CLIPPING
 Clipping keeps only the portion of a graphic inside a region.
 This demo uses Java's clip rectangle.
*/
import javax.swing.*;
import java.awt.*;

public class Day11_Clipping extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(80, 60, 300, 200);
        Shape old = g.getClip();
        g.clipRect(150, 100, 160, 120);
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 420, 280);
        g.drawOval(70, 40, 300, 260);
        g.setClip(old);
        g.drawRect(150, 100, 160, 120);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 11");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 340);
        f.add(new Day11_Clipping());
        f.setVisible(true);
    }
}
