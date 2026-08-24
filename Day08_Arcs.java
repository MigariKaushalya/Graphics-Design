/*
 DAY 08 - ARCS AND ELLIPSES
*/
import javax.swing.*;
import java.awt.*;

public class Day08_Arcs extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(50, 60, 180, 100);
        g.drawArc(260, 60, 150, 150, 30, 240);
        g.fillArc(80, 200, 150, 100, 0, 180);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 08");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(480, 360);
        f.add(new Day08_Arcs());
        f.setVisible(true);
    }
}
