import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutStream {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        FileOutputStream fos=new FileOutputStream(file);
        byte[] data={'a','z'};
        fos.write(data);
        fos.close();
    }
}