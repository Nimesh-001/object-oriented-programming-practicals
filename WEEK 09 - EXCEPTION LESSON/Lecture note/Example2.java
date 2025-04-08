public class Example2 {
    int division(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;

    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        try {
            System.out.println(example2.division(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("you should n't divide number by zero..");
        }
    }
}
