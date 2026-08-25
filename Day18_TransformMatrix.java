/*
 DAY 18 - MATRIX PRACTICE
 Build a small 3x3 matrix multiplication utility.
*/
public class Day18_TransformMatrix {
    static double[][] multiply(double[][] a, double[][] b) {
        double[][] c = new double[3][3];
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                for (int k=0;k<3;k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
    }
    public static void main(String[] args) {
        double[][] t = {{1,0,50},{0,1,30},{0,0,1}};
        double[][] p = {{10},{20},{1}};
        double x = t[0][0]*p[0][0] + t[0][1]*p[1][0] + t[0][2]*p[2][0];
        double y = t[1][0]*p[0][0] + t[1][1]*p[1][0] + t[1][2]*p[2][0];
        System.out.println("New point = (" + x + ", " + y + ")");
    }
}
