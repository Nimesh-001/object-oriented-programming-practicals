import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checkedexample {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream FS= new FileInputStream("myfile.txt");
    }
}
