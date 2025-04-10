import java.io.*;

public class Mycharacterwriting {
    public static void main(String[] args) {

        File file=new File("C:\\Users\\ICT_Common.LAB12-192\\Desktop\\tg1395\\student.txt");
        try {
            FileWriter fw= new FileWriter(file,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw,true);
            pw.println("ICT004    NAMAL");


            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);

            String line=br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }


        } catch (IOException e) {
            System.out.println("");
        }

    }
}
