import java.util.Scanner;
public class Shapedemo {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num;

        Sphere sphere=new Sphere();
        Cone cone=new Cone();
        Myshape myshape=new Myshape();

        do{
            System.out.println("please enter the number of the shape.");
            System.out.println("1.sphere");
            System.out.println("2.cone");
            System.out.println("3.myshape");
            System.out.println("0.exit");

            System.out.print("Enter your answer:");
            num = scanner.nextInt();

            switch (num){
                case 1:
                    System.out.println("you have selected the spehere");
                    System.out.println("enter the value for the radius :");
                    double radius = scanner.nextDouble();
                    sphere.getspherevolume(radius);
                    break;


                case 2:
                    System.out.println("you have selected the cone");
                    System.out.println("please entr the value for radius:");
                    double coneradius=scanner.nextDouble();
                    System.out.println("please enter the value for height:");
                    double coneheight=scanner.nextDouble();
                    cone.getconevolume(coneradius,coneheight);
                    break;


                case 3:
                    System.out.println("you have selected the myshape");
                    System.out.println("enter the value for the radius:");
                    double myradius=scanner.nextDouble();
                    System.out.println("please enter the value for height:");
                    double myheight=scanner.nextDouble();
                    myshape.getmyshapevolume(myradius);
                    break;


                case 0:
                    System.out.println("exiting.......");
                    break;


                default:
                    System.out.println("please try again...");


            }

        }
        while(num!=0);

    }
}
