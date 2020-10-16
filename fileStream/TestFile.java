import java.io.File;

public class TestFile {
    static long minSize = Integer.MAX_VALUE;
    static long maxSize;
    static File minFile;
    static File maxFile;

    public static void main(String[] args) {
        File file = new File("e:\\");
        traverseDir(file);
        System.out.println("maxFile:" + maxFile.getAbsolutePath() + " length:" + maxFile.length());
        System.out.println("minFile:" + minFile + " length:" + minFile.length());
    }

    public static void traverseDir(File file) {
        File[] files = file.listFiles();
        if (files == null)
            return;
        for (File file2 : files) {
            if (file2.isDirectory())
                traverseDir(file2);
            else if (file2.length() > maxSize) {
                maxSize = file2.length();
                maxFile = file2;
            } else if (file2.length() < minSize && file2.length() != 0) {
                minSize = file2.length();
                minFile = file2;
            }
        }
    }
}