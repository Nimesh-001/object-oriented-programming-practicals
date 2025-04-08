public class ex2 {
    public static void main(String[] args) {
        try {
            int a = 5/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception"+e.getMessage());

        }
        finally {
            System.out.println("this is final block.....");
        }
    }
}

//Arithmetic Exception/ by zero
//this is final block.....

//Process finished with exit code 0
