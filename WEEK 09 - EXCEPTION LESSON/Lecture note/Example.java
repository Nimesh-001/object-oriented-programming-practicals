public class Example {
    void checkage(int age){
        if(age < 18){
            throw new ArithmeticException("not eligible for vorting...");
        }
        else{
            System.out.println("I am eligible for vorting...");
        }

    }
    public static void main(String[] args) {
        Example example = new Example();
        example.checkage(13);
        System.out.println("end of program...");
    }
}
