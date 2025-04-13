import java.io.*;

public class Ex {
    public static void main(String[] args) {
        File file= new File("C:\\\\Users\\\\ICT_Common.LAB12-192\\\\Desktop\\\\tg1395\\\\student.dat");
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        DataOutputStream dos=null;

        try {
            fos=new FileOutputStream(file);//what if have truuuu-append other wise replasing it.
            bos=new BufferedOutputStream(fos);
            dos=new DataOutputStream(bos);

            dos.writeInt(1);
            dos.writeUTF("jhon");
            dos.writeDouble(11.15);

            dos.flush();//do this in finnally block
            dos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}

