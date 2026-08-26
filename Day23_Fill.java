/*
 DAY 23 - FLOOD FILL
 Learn recursive/stack based region filling.
*/
import java.awt.image.BufferedImage;
import java.awt.*;
import java.util.*;

public class Day23_Fill {
    static void floodFill(BufferedImage img, int sx, int sy, int replacement) {
        int target = img.getRGB(sx, sy);
        if (target == replacement) return;
        int w=img.getWidth(), h=img.getHeight();
        ArrayDeque<Point> q=new ArrayDeque<>();
        q.add(new Point(sx,sy));
        while(!q.isEmpty()){
            Point p=q.remove();
            if(p.x<0||p.x>=w||p.y<0||p.y>=h) continue;
            if(img.getRGB(p.x,p.y)!=target) continue;
            img.setRGB(p.x,p.y,replacement);
            q.add(new Point(p.x+1,p.y));
            q.add(new Point(p.x-1,p.y));
            q.add(new Point(p.x,p.y+1));
            q.add(new Point(p.x,p.y-1));
        }
    }
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
        floodFill(image,50,50,Color.RED.getRGB());
        System.out.println("Flood fill completed.");
    }
}
