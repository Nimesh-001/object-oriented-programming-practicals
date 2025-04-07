import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

        Test test=new Test();
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter num 1:");
        int x=scanner.nextInt();

        System.out.println("enter num 2:");
        int y=scanner.nextInt();

        int result=(x/y);
        System.out.println(result);



    }
}
