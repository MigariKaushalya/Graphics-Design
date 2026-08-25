/*
 DAY 19 - ANIMATION
 Animation = repeatedly update state + repaint.
*/
import javax.swing.*;
import java.awt.*;

public class Day19_Animation extends JPanel {
    int x = 0;
    public Day19_Animation() {
        new Timer(30, e -> {
            x += 3;
            if (x > getWidth()) x = -40;
            repaint();
        }).start();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 40, 40);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 19");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 250);
        f.add(new Day19_Animation());
        f.setVisible(true);
    }
}
