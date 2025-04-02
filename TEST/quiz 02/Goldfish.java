public class Goldfish extends Fish{
    public static void breath(){
        System.out.println("gold fish is breating....");
    }

    public static void main(String[] args) {
        Fish fish = new Goldfish();
        fish.breath();
    }
}
