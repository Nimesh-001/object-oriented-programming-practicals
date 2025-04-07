public class A {
    int division(int a,int b) throws ArithmeticException{
        int t=a/b;
        return t;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.division(5,0));

    }
}
