/*
 DAY 28 - LIGHTING
 Lambert diffuse idea:
 intensity = max(0, N dot L)
*/
public class Day28_Lighting {
    static double dot(double[] a,double[] b){
        return a[0]*b[0]+a[1]*b[1]+a[2]*b[2];
    }
    public static void main(String[] args){
        double[] normal={0,0,1};
        double[] light={0,0,1};
        double intensity=Math.max(0,dot(normal,light));
        System.out.println("Diffuse intensity = " + intensity);
        System.out.println("Practice: normalize vectors before using dot product.");
    }
}
