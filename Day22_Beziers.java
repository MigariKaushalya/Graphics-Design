/*
 DAY 22 - BEZIER CURVES
 Quadratic Bezier:
 B(t)=(1-t)^2 P0 + 2(1-t)t P1 + t^2 P2
*/
import javax.swing.*;
import java.awt.*;

public class Day22_Beziers extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int p0x=50,p0y=220,p1x=220,p1y=30,p2x=400,p2y=220;
        int oldx=p0x, oldy=p0y;
        for(int i=1;i<=100;i++){
            double t=i/100.0;
            double u=1-t;
            int x=(int)(u*u*p0x+2*u*t*p1x+t*t*p2x);
            int y=(int)(u*u*p0y+2*u*t*p1y+t*t*p2y);
            g.drawLine(oldx,oldy,x,y);
            oldx=x; oldy=y;
        }
        g.fillOval(p0x-4,p0y-4,8,8);
        g.fillOval(p1x-4,p1y-4,8,8);
        g.fillOval(p2x-4,p2y-4,8,8);
    }
    public static void main(String[] args){
        JFrame f=new JFrame("Day 22");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,300);
        f.add(new Day22_Beziers());
        f.setVisible(true);
    }
}
