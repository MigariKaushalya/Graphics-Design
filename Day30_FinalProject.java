/*
 DAY 30 - FINAL PROJECT
 Mini 2D Computer Graphics Project:
 Interactive bouncing ball with keyboard controls.

 CONTROLS:
 LEFT / RIGHT = change horizontal direction
 SPACE = reset ball

 This combines: window, drawing, color, animation and keyboard input.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Day30_FinalProject extends JPanel {
    int x=100,y=100,dx=4,dy=3;

    public Day30_FinalProject(){
        setFocusable(true);
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_LEFT) dx=-Math.abs(dx);
                if(e.getKeyCode()==KeyEvent.VK_RIGHT) dx=Math.abs(dx);
                if(e.getKeyCode()==KeyEvent.VK_SPACE){x=100;y=100;}
            }
        });
        new Timer(20,e->{
            x+=dx; y+=dy;
            if(x<0 || x>getWidth()-40) dx=-dx;
            if(y<0 || y>getHeight()-40) dy=-dy;
            repaint();
        }).start();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Final Project - Bouncing Ball",20,25);
        g.fillOval(x,y,40,40);
    }

    public static void main(String[] args){
        JFrame f=new JFrame("Day 30 - Computer Graphics");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,400);
        Day30_FinalProject panel=new Day30_FinalProject();
        f.add(panel);
        f.setVisible(true);
        panel.requestFocusInWindow();
    }
}
