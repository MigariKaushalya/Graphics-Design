/*
 DAY 07 - CIRCLE
 Learn circle equation and Java's ellipse drawing.
*/
import javax.swing.*;
import java.awt.*;

public class Day07_Circles extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(100, 70, 200, 200);
        g.drawOval(150, 120, 100, 100);
        g.fillOval(195, 165, 10, 10);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 07");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420, 350);
        f.add(new Day07_Circles());
        f.setVisible(true);
    }
}
