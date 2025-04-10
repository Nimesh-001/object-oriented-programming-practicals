import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mybinaryreading {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ICT_Common.LAB12-192\\Desktop\\tg1395\\student.dat");

        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
