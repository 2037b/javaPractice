import java.io.File;
import java.io.FileWriter;

public class TestFileWriter{
    public static void main(String[] args) {
        File file=new File("test2.txt");
        try (FileWriter fw=new FileWriter(file)) {
            String data="abcdefg";
            char[] content=data.toCharArray();
            fw.write(content);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}