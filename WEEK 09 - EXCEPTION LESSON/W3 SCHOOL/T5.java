public class T5 {

    static void checkage(int age){
        if(age<18){
            throw new ArithmeticException("access denied - you must be at least 18 years old");
        }
        else{
            System.out.println("access granted - you are old enough....");
        }
    }


    public static void main(String[] args) {
        checkage(15);

    }
}


//Exception in thread "main" java.lang.ArithmeticException: access denied - you must be at least 18 years old
//	at T4.checkage(T4.java:5)
//	at T4.main(T4.java:14)

//Process finished with exit code 1

