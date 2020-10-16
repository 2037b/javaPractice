import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

  /**
   * @param srcPath  源文件
   * @param destPath 目标文件
   */
  public static void copyFile(String srcPath, String destPath) {
    File srcFile = new File(srcPath);
    File destFile = new File(destPath);

    //缓存区，一次性读取1024字节
    byte[] buffer = new byte[1024];

    try (
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile)
    ) {
      while (true) {
        //实际读取的长度是 actuallyReaded,有可能小于1024
        int actuallyReaded = fis.read(buffer);
        //-1表示没有可读的内容了
        if (-1 == actuallyReaded)
          break;
        fos.write(buffer, 0, actuallyReaded);
//        fos.flush();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  /**
   * @param srcPath  源文件夹
   * @param destPath 目标文件夹
   */
  public static void copyFolder(String srcPath, String destPath) {

  }

  public static void main(String[] args) {

    copyFile("F:\\javaPractice\\fileStream\\test.txt", "F:\\javaPractice\\fileStream\\test2.txt");

  }
}
