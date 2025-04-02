public class Goldfishh extends Fishh{
    public void sleep(){
        super.sleep();
        System.out.println("gold fish is sleeping...");
    }

    public static void main(String[] args) {
        Fishh myfishh = new Goldfishh();
        myfishh.sleep();
    }
}
