public class ex11 {
    public static void main(String[] args) {

        try {
            int a = 5/0;
            System.out.println("rest of code in try block..");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception"+e.getMessage());
        }
    }
}

//Arithmetic Exception/ by zero

//Process finished with exit code 0
