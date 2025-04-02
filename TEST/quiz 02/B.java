public class B extends A{
    String color="black";

    public static void main(String[] args) {
        B b=new B();
        A a=new B();
        System.out.println(b.color );
        System.out.println(a.color);
    }
}
