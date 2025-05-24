import java.util.HashSet;

public class Setexample {
    public static void main(String[] args) {
        HashSet<String>fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");//duplicate ignore 

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
