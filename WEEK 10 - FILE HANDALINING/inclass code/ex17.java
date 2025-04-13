import java.io.*;

public class Mybinaryreading {


    public static void main(String[] args) {
        File file= new File("C:\\\\Users\\\\ICT_Common.LAB12-192\\\\Desktop\\\\tg1395\\\\student.dat");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        try {
            fis= new FileInputStream(file);
            bis= new BufferedInputStream(fis);
            dis= new DataInputStream(bis);

            int i= dis.readInt();
            String s= dis.readUTF();
            Double d= dis.readDouble();
            System.out.println(i);
            System.out.println(s);
            System.out.println(d);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}
