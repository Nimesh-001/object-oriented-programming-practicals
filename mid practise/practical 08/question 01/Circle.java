public class Circle {

    private double radius=1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getarea(){
        return Math.PI*Math.pow(radius,2);
    }
}
