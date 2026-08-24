/*
 DAY 10 - RGB COLORS
 Learn additive RGB color and Color objects.
*/
import javax.swing.*;
import java.awt.*;

public class Day10_Colors extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(255, 0, 0)); g.fillRect(30, 50, 100, 100);
        g.setColor(new Color(0, 255, 0)); g.fillRect(140, 50, 100, 100);
        g.setColor(new Color(0, 0, 255)); g.fillRect(250, 50, 100, 100);
        g.setColor(Color.BLACK); g.drawString("RGB: Red + Green + Blue", 100, 200);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Day 10");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 270);
        f.add(new Day10_Colors());
        f.setVisible(true);
    }
}
