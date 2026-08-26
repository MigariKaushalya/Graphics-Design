/*
 DAY 21 - KEYBOARD INPUT
 Use key bindings to move an object.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Day21_KeyboardInput extends JPanel {
    int x=200, y=120;
    public Day21_KeyboardInput() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_LEFT) x-=10;
                if (e.getKeyCode()==KeyEvent.VK_RIGHT) x+=10;
                if (e.getKeyCode()==KeyEvent.VK_UP) y-=10;
                if (e.getKeyCode()==KeyEvent.VK_DOWN) y+=10;
                repaint();
            }
        });
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(x, y, 40, 40);
    }
    public static void main(String[] args) {
        JFrame f=new JFrame("Day 21");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,300);
        f.add(new Day21_KeyboardInput());
        f.setVisible(true);
    }
}
