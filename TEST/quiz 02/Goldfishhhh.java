public class Goldfishhhh extends Fishhhh{
    public Goldfishhhh() {
        System.out.println("default constructor of gold fish...");
    }

    public Goldfishhhh(String color) {
        super();
        System.out.println("parameterized constructor of goldfish...");
    }

    public static void main(String[] args) {
        Fishhhh fishhhh=new Goldfishhhh("red");

    }
}
