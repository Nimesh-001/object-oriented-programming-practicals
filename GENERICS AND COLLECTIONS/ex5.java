import java.util.ArrayList;

public class Listexample {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        
        names.add("alice");
        names.add("bob");
        names.add("alice");//duplicate allow

        System.out.println("first name: "+ names.get(0));
        for (String name:names){
            System.out.println(name);
        }
    }
}
