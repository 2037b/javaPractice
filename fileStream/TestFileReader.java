import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestFileReader {
    public static void main(String[] args) {
        File file = new File("F:\\javaPractice\\fileStream\\test.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            char[] all = new char[(int) file.length()];
            System.out.println(all.length+" "+file.length());
            fr.read(all);
            System.out.println(Arrays.toString(all));
            for (char c : all) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}