import java.util.LinkedList;
import java.util.Queue;

public class Queueexample {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.add("task1");
        tasks.add("task2");
        tasks.add("task3");

        System.out.println("processing: "+tasks.poll());
        System.out.println("next task: "+tasks.peek());
    }
}
