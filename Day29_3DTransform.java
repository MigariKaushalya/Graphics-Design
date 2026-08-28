/*
 DAY 29 - 3D TRANSFORMATIONS
 Learn translation, scaling and rotation concepts for x,y,z.
*/
public class Day29_3DTransform {
    static double[] translate(double x,double y,double z,double tx,double ty,double tz){
        return new double[]{x+tx,y+ty,z+tz};
    }
    public static void main(String[] args){
        double[] p=translate(1,2,3,5,4,2);
        System.out.println("New point: ("+p[0]+","+p[1]+","+p[2]+")");
        System.out.println("Practice: implement X, Y and Z rotation matrices.");
    }
}
