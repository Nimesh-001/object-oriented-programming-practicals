public class T3 {
    public static void main(String[] args) {
        try {
            int[] number={1,2,3};
            System.out.println(number[10]);
        } catch (Exception e) {
            System.out.println("something went wrong....");
        }finally {
            System.out.println("the try catch is finished....");
        }
    }
}

//something went wrong....
//the try catch is finished....

//Process finished with exit code 0
