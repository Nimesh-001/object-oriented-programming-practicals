public class B implements A {

    @Override
    public void getarea() {
        int length=6;
        int breadth=5;
        int area=length*breadth;
        System.out.println("the area of the rectangle is:"+area);


    }

    @Override
    public void getsides() {
        System.out.println("i have 4 sides");
    }
}
