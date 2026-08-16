/*
 DAY 03 - 2D COORDINATES
 In Java AWT, (0,0) is near the top-left.
 x increases to the right; y increases downward.
*/
import javax.swing.*;
import java.awt.*;

public class Day03_Coordinates extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(20, 200, 450, 200);
        g.drawLine(20, 200, 20, 20);
        g.drawString("X axis", 400, 190);
        g.drawString("Y axis", 25, 35);
        g.fillOval(190, 100, 20, 20);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 03");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.add(new Day03_Coordinates());
        f.setVisible(true);
    }
}
