import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class MurgeFile {
    public static void main(String[] args) {
        murgeFile("F:\\","Web Api.zip");
    }
    static void murgeFile(String folder,String fileName){
        try{
            File destFile=new File(folder,fileName);
            FileOutputStream fos=new FileOutputStream(destFile);
            int index=0;
            while(true){
                File eachFile=new File(folder,fileName+'-'+index++);
                if(!eachFile.exists())break;
                FileInputStream fis=new FileInputStream(eachFile);
                byte[] eachContent=new byte[(int)eachFile.length()];
                fis.read(eachContent);
                fis.close();
                fos.write(eachContent);
                fos.flush();
                System.out.printf("把子文件%s写出到目标文件中%n",eachFile);
            }
            fos.close();
            System.out.printf("最后目标文件的大小：%,d字节",destFile.length());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}