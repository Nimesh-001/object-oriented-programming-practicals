public class unchecked {
    public static void main(String[] args) {

        System.out.println("start....");
        int mynumber[] ={1,2,3,4,5};
        try {
            System.out.println(mynumber[7]);
        } catch (NullPointerException e) {
            //throw new RuntimeException(e);
            System.out.println("null pointer....");
            //System.out.println(e.fillInStackTrace());
            //e.printStackTrace();
        } catch (Exception e){
            System.out.println("generic exception....");
        }

        System.out.println("end...");
    }
}
