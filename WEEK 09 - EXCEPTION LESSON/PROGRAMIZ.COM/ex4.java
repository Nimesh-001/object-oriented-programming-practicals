import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ex4 {

    public static void findfile() throws IOException {
        File newfile = new File("text.txt");
        FileInputStream fis = new FileInputStream(newfile);
    }

    public static void main(String[] args) {
        try {
            findfile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

//java.io.FileNotFoundException: text.txt (The system cannot find the file specified)

//Process finished with exit code 0
