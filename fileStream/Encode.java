import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Encode {

  public static void main(String[] args) {
    encodeFile(new File("F:\\javaPractice\\fileStream\\src.txt"),
        new File("F:\\javaPractice\\fileStream\\des.txt"));
  }

  static void encodeFile(File encodingFile, File encodedFile) {
    System.out.println(encodedFile.getAbsolutePath());
    try (FileReader reader = new FileReader(encodingFile); FileWriter writer = new FileWriter(
        encodedFile)) {
      char[] all = new char[(int) encodingFile.length()];
      reader.read(all);
      System.out.println(Arrays.toString(all));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
