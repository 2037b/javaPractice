import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestStream {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] all=new byte[100];
            fis.read(all);
            System.out.println(new String(all));
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}