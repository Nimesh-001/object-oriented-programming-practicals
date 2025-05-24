import java.util.HashMap;

public class Mapexample {
    public static void main(String[] args) {
        HashMap<String,Integer> marks = new HashMap<>();

        marks.put("tom",90);
        marks.put("jerry",85);
        marks.put("tom",95);//overite previos value

        for(String name: marks.keySet()){
            System.out.println(name+" scored "+marks.get(name));
        }
    }
}
