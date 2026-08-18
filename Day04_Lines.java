/*
 DAY 04 - LINES
 Learn the idea behind line drawing and Java's drawLine().
*/
import javax.swing.*;
import java.awt.*;

public class Day04_Lines extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 10; i++) {
            g.drawLine(30, 30 + i * 25, 300, 30 + i * 25);
        }
        for (int i = 0; i < 10; i++) {
            g.drawLine(30 + i * 25, 30, 300, 255);
        }
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 04");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 320);
        f.add(new Day04_Lines());
        f.setVisible(true);
    }
}
