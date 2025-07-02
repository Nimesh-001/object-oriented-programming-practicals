import java.io.*;

public class test5 {
    public static void main(String[] args) {
        File f = new File("test5.txt");

        try {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw, true);
            pw.write("first line");
            pw.write("second line");
            pw.write("third line");
            pw.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line=null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
            br.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
