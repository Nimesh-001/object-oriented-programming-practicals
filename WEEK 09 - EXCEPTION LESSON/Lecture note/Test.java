public class Test {
    public static void main(String[] args) {
        try {
            int a[]=new int[2];
            System.out.println("access element in third index:"+ a[3]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of block");
        }


    }
}
