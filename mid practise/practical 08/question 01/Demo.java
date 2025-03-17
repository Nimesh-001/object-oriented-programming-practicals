public class Demo {
    public static void main(String[] args) {

        Cylinder c1=new Cylinder();
        Cylinder c2=new Cylinder(10.0);
        Cylinder c3=new Cylinder(7.0,10.0);

        System.out.println("c1--> radius:"+c1.getRadius()+" height:"+c1.getHeight()+" base area:"+c1.getarea()+" volume:"+c1.getvolume());
        System.out.println("c2--> radius:"+c2.getRadius()+" height:"+c2.getHeight()+" base area:"+c2.getarea()+" volume:"+c2.getvolume());
        System.out.println("c3--> radius:"+c3.getRadius()+" height:"+c3.getHeight()+" base area:"+c3.getarea()+" voloume:"+c3.getvolume());
    }
}
