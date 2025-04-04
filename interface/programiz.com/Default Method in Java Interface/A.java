public interface A {
    void getarea();

    default void getsides() {
        System.out.println("i can get sides of a polygon");
    }

}
