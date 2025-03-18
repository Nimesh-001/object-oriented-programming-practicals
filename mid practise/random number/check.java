import java.util.Random;
import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number:");
        int num2=scanner.nextInt();

        if(num==num2){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong");
            System.out.println("answer is:"+num);
        }


    }
}
