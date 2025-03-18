import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Sphere s=new Sphere();
        Cylinder c=new Cylinder();
        Myshape m=new Myshape();

        int choice;

        do {
            System.out.println("please enter the number of shape");
            System.out.println();
            System.out.println("1.sphere");
            System.out.println("2.cylinder");
            System.out.println("3.myshape");
            System.out.println("4.exit");
            System.out.println();

            System.out.println("enter your choice:");
            choice=sc.nextInt();


            switch (choice){
                case 1:
                    System.out.println("enter radius:");
                    double radius=sc.nextDouble();
                    double a=s.getVolume(radius);
                    System.out.println("answer is: "+a);
                    break;

                case 2:
                    System.out.println("enter radius:");
                    double r1=sc.nextDouble();
                    System.out.println("enter height:");
                    double h1=sc.nextDouble();

                    double a2=c.getVolume(r1,h1);
                    System.out.println("answer is: "+a2);
                    break;


                case 3:
                    System.out.println("enter radius:" );

                    break;

                case 4:
                    System.out.println("exiting....");
            }

        }
        while (choice!=4);
    }
}
