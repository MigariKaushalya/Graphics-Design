/*
 DAY 06 - BRESENHAM LINE ALGORITHM
 Uses integer calculations to choose the closest pixel.
*/
import javax.swing.*;
import java.awt.*;

public class Day06_Bresenham extends JPanel {
    void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2-x1), dy = Math.abs(y2-y1);
        int sx = x1 < x2 ? 1 : -1, sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;

        while (true) {
            g.fillRect(x1, y1, 2, 2);
            if (x1 == x2 && y1 == y2) break;
            int e2 = 2 * err;
            if (e2 > -dy) { err -= dy; x1 += sx; }
            if (e2 < dx)  { err += dx; y1 += sy; }
        }
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawLine(g, 50, 50, 420, 250);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 06 - Bresenham");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 350);
        f.add(new Day06_Bresenham());
        f.setVisible(true);
    }
}
