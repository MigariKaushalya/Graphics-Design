/*
 DAY 20 - MOUSE INPUT
 Learn MouseAdapter and interactive drawing.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Day20_MouseInput extends JPanel {
    int mx = 200, my = 120;
    public Day20_MouseInput() {
        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                mx = e.getX(); my = e.getY(); repaint();
            }
        });
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Move the mouse", 20, 30);
        g.fillOval(mx - 10, my - 10, 20, 20);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 20");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.add(new Day20_MouseInput());
        f.setVisible(true);
    }
}
