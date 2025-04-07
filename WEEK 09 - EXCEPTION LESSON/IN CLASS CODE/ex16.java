import java.io.FileNotFoundException;

public class A {
    int division(int a,int b) throws ArithmeticException, FileNotFoundException {
        int t=a/b;
        return t;
    }

    public static void main(String[] args) {
        A a = new A();
        try {
            System.out.println(a.division(5,0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
