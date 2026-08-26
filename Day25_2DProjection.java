/*
 DAY 25 - PROJECTION
 A simple projection maps world coordinates to screen coordinates.
*/
public class Day25_2DProjection {
    static int screenX(double worldX, double minX, double maxX, int width) {
        return (int)((worldX-minX)/(maxX-minX)*width);
    }
    public static void main(String[] args) {
        System.out.println(screenX(5,0,10,800));
        System.out.println("Practice: implement screenY and window-to-viewport mapping.");
    }
}
