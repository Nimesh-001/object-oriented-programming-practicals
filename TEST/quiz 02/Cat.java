public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        System.out.println("z");
    }

    public static void main(String[] args) {
        Animal cat=new Cat("cat");
    }
}
