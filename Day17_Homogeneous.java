/*
 DAY 17 - HOMOGENEOUS COORDINATES
 A 2D point is represented as [x y 1].
 Translation becomes matrix multiplication.
*/
public class Day17_Homogeneous {
    static double[] translate(double x, double y, double tx, double ty) {
        return new double[]{x + tx, y + ty, 1};
    }
    public static void main(String[] args) {
        double[] p = translate(10, 20, 50, 30);
        System.out.println("Original: (10,20)");
        System.out.println("Translated: (" + p[0] + "," + p[1] + ")");
        System.out.println("Practice: implement rotation and scaling matrices.");
    }
}
