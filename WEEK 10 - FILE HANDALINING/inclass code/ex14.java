import java.io.*;

public class Mybinaryreading {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ICT_Common.LAB12-192\\Desktop\\tg1395\\student.dat");

        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            String line= String.valueOf(bis.read());
            System.out.println(line);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Error");
        }
    }
}
