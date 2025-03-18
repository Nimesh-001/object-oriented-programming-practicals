public class Cylinder {

    public double radius;
    public double height;

    public double getVolume(double radius, double height) {
        double ans2=(2*Math.PI*Math.pow(radius,2)+(2*Math.PI*radius*height));
        return ans2;
    }
}
