public abstract class Animal {
    String name;

    public Animal() {
        System.out.println("X");
    }

    public Animal(String name) {
        this();
        System.out.println("Y");
    }
}
