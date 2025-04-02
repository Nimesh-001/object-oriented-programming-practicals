public class Goldfishhh extends Fishhh{
    public void swim(){
        System.out.println("gold fish is swiming...");
    }

    public static void main(String[] args) {
        //Goldfishhh myfishhh = new Goldfishhh();
        //myfishhh.swim();

        Fishhh myfishhh = new Goldfishhh();
        myfishhh.swim();
    }
}
