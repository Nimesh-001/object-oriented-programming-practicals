public class ex3 {

    public static void dividebyzero(){
        throw  new ArithmeticException("divide by zero");
    }

    public static void main(String[] args) {
        dividebyzero();

    }
}

//Exception in thread "main" java.lang.ArithmeticException: divide by zero
//	at ex3.dividebyzero(ex3.java:4)
//	at ex3.main(ex3.java:8)

//Process finished with exit code 1
