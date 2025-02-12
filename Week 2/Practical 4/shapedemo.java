import java.util.Scanner;

public class shapedemo{

	public static void main(String[] args){

		Scanner scanner=new Scanner(System.in);
		int userinput;
		
		Sphere sphere=new Sphere();
		Cone cone=new Cone();
		Myshape myshape=new Myshape();

		do{
			System.out.println("please enter the number of shape");
			System.out.println("1.sphere");
			System.out.println("2.cone");
			System.out.println("3.myshape");
			System.out.println("0.exit");

			System.out.print("enter your answer: ");
			userinput=scanner.nextInt();
		

		switch(userinput){

		case 1:
			System.out.println("you have select the sphere.");
			System.out.print("Enter the value for radius: ");
			double radius=scanner.nextDouble();
			sphere.getSphereVolume(radius);
			break;

		case 2:
			System.out.println("you have selected the cone.");
			System.out.print("Enter value for radius: ");
                    	double coneRadius = scanner.nextDouble();
                    	System.out.print("Enter value for the height: ");
                    	double height = scanner.nextDouble();
			cone.getConeVolume(coneRadius, height);
			break;

		case 3:
			System.out.println("you have selected the myshape");
			System.out.print("Enter radius: ");
                    	double myshapeRadius = scanner.nextDouble();
			myshape.getMyShapeVolume(myshapeRadius);
			break;

		case 0:
			System.out.println("exiting.....");
			break;

		default:
			System.out.println("invalid choice, please try again.");
		}
	}while(userinput!=0);
}
}
