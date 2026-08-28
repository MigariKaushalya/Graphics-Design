/*
 DAY 26 - 3D BASICS
 A 3D point has x, y, z.
 This demo uses a simple perspective projection.
*/
import javax.swing.*;
import java.awt.*;

public class Day26_3DPoints extends JPanel {
    int projectX(double x,double z){ return (int)(250 + x*150/(z+4)); }
    int projectY(double y,double z){ return (int)(150 - y*150/(z+4)); }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        double[][] pts={{-1,-1,1},{1,-1,1},{1,1,1},{-1,1,1},
                        {-1,-1,3},{1,-1,3},{1,1,3},{-1,1,3}};
        int[][] edges={{0,1},{1,2},{2,3},{3,0},{4,5},{5,6},{6,7},{7,4},
                       {0,4},{1,5},{2,6},{3,7}};
        for(int[] e:edges){
            double[] a=pts[e[0]], b=pts[e[1]];
            g.drawLine(projectX(a[0],a[2]),projectY(a[1],a[2]),
                       projectX(b[0],b[2]),projectY(b[1],b[2]));
        }
    }
    public static void main(String[] args){
        JFrame f=new JFrame("Day 26");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,320);
        f.add(new Day26_3DPoints());
        f.setVisible(true);
    }
}
