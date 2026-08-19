/*
 DAY 05 - DDA LINE ALGORITHM
 DDA calculates intermediate pixels using floating-point increments.
*/
import javax.swing.*;
import java.awt.*;

public class Day05_DDA extends JPanel {
    void drawDDA(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = x2 - x1, dy = y2 - y1;
        int steps = Math.max(Math.abs(dx), Math.abs(dy));
        double xInc = dx / (double) steps;
        double yInc = dy / (double) steps;
        double x = x1, y = y1;

        for (int i = 0; i <= steps; i++) {
            g.fillRect((int)Math.round(x), (int)Math.round(y), 2, 2);
            x += xInc; y += yInc;
        }
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawDDA(g, 50, 50, 400, 250);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 05 - DDA");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 350);
        f.add(new Day05_DDA());
        f.setVisible(true);
    }
}
