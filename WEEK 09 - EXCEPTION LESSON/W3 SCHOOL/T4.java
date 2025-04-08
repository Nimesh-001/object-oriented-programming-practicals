public class T4 {

    static void checkage(int age){
        if(age<18){
            throw new ArithmeticException("access denied - you must be at least 18 years old");
        }
        else{
            System.out.println("access granted - you are old enough....");
        }
    }


    public static void main(String[] args) {
        checkage(18);

    }
}

//access granted - you are old enough....

//Process finished with exit code 0
