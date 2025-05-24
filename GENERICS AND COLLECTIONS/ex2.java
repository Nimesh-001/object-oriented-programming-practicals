public class Demo {
    public static void main(String[] args) {
        Box <String> strbox =new Box<>();
        strbox.setValue("mybox");
        System.out.println(strbox.getValue());


        Box <Integer> strbox2 = new Box<>();
        strbox2.setValue(10);
        System.out.println(strbox2.getValue());

    }
}
