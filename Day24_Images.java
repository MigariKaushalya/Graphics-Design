/*
 DAY 24 - PIXEL MANIPULATION
 Learn BufferedImage and getRGB/setRGB.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Day24_Images extends JPanel {
    BufferedImage image = new BufferedImage(300,200,BufferedImage.TYPE_INT_RGB);
    public Day24_Images() {
        for(int y=0;y<200;y++)
            for(int x=0;x<300;x++) {
                int r=x*255/299;
                int b=y*255/199;
                image.setRGB(x,y,new Color(r,50,b).getRGB());
            }
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,20,30,null);
    }
    public static void main(String[] args){
        JFrame f=new JFrame("Day 24");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(360,280);
        f.add(new Day24_Images());
        f.setVisible(true);
    }
}
