import java.util.ArrayList;

public class NoGenericsExample {

    public static void main(String[] args) {

        ArrayList <String>list=new ArrayList<>();
        list.add("java");
        //list.add(123);

        String text = (String) list.get(0);
        //String number = (String) list.add(1);
        System.out.println(text);
    }
}

