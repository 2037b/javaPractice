import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        File file=new File("test3.txt");
        try {
            FileInputStream fis=new FileInputStream(file);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("df");
        }
    }
}
