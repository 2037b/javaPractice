import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SplitFile {
    public static void main(String[] args) {
        int eachSize = 100 * 1024;
        File srcFile = new File("F:\\Web Api.zip");
        split(srcFile, eachSize);
    }

    static void split(File srcFile, int eachSize) {
        if (srcFile.length() == 0)
            throw new RuntimeException("文件长度为0，不可拆分。");
        byte[] fileContent = new byte[(int) srcFile.length()];
        try {
            FileInputStream fis = new FileInputStream(srcFile);
            fis.read(fileContent);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int fileNum;
        if (fileContent.length % eachSize == 0) {
            fileNum = fileContent.length / eachSize;
        } else
            fileNum = (fileContent.length / eachSize) + 1;
        for (int i = 0; i < fileNum; i++) {
            String eachFileName = srcFile.getName() + '-' + i;
            File eachFile = new File(srcFile.getParent(), eachFileName);
            byte[] eachContent;
            if (i != fileNum - 1)
                eachContent = Arrays.copyOfRange(fileContent, eachSize * i, eachSize * (i + 1));
            else
                eachContent = Arrays.copyOfRange(fileContent, eachSize * i, fileContent.length);
            try{
                FileOutputStream fos=new FileOutputStream(eachFile);
                fos.write(eachContent);
                fos.close();
                System.out.printf("输出子文件%s，其大小是%d字节%n",eachFile,eachFile.length());
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}