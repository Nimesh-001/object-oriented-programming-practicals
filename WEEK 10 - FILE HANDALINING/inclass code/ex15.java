import java.io.*;

public class Mybinaryreading {
   /* public static void main(String[] args) {

        File file = new File("C:\\Users\\ICT_Common.LAB12-192\\Desktop\\tg1395\\student.dat");

        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);



        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    */

    public static void main(String[] args) {
        File file= new File("C:\\\\Users\\\\ICT_Common.LAB12-192\\\\Desktop\\\\tg1395\\\\student.dat");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        try {
            fis= new FileInputStream(file);
            bis= new BufferedInputStream(fis);
            dis= new DataInputStream(bis);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
