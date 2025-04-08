public class ex1 {
    public static void main(String[] args) {

        try {
            int a = 5/0;
            System.out.println("rest of code in try block..");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }
}

//Arithmetic Exception

//Process finished with exit code 0
