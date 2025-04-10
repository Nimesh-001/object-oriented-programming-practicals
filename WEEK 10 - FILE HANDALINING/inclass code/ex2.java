import java.io.*;

public class Myfilehandeling {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ICT_Common.LAB12-192\\Desktop\\tg1395\\student.txt");

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr =new FileReader(file);//first code this..
            br = new BufferedReader(fr);


            do {
                String line = br.readLine();//second code this
                System.out.println(line);
            }
            while (br.ready());


        } catch (FileNotFoundException e) {
            System.out.println("File not found"+e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error"+e.getMessage());
        }
    }
}
