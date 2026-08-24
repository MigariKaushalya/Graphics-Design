/*
 DAY 09 - POLYGONS
 Learn vertices, edges, polygon filling.
*/
import javax.swing.*;
import java.awt.*;

public class Day09_Polygons extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] x = {80, 180, 260, 200, 100};
        int[] y = {220, 80, 150, 270, 280};
        g.drawPolygon(x, y, x.length);
        g.fillPolygon(new int[]{300, 380, 430, 340}, new int[]{220, 100, 220, 280}, 4);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 09");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 350);
        f.add(new Day09_Polygons());
        f.setVisible(true);
    }
}
