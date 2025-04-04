import java.lang.Math;

public interface Aa {
    void getarea();

    default void getperimeter(int sides){
        int peremeter=0;
        for (int side: sides){
            peremeter=peremeter+side;
        }
        System.out.println("perimeter is:"+peremeter);
    }
}
