import java.util.Arrays;

public class RepeatStrings {
    public static void main(String[] args) {
        int count=0;
        String[] strings = new String[100];
        String[] repeatStrings=new String[100];
        for (int i = 0; i < strings.length; i++) {
            strings[i]=randomString();
        }
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length-1; i++) {
            for (int j = i+1; j < strings.length; j++) {
              if(strings[i].equals(strings[j])){
                count++;
                repeatStrings[count-1]=strings[i];
              }  
            }
        }
        System.out.println("重复的值有"+count+"种。");
        System.out.println(Arrays.toString(repeatStrings));
    }

    static String randomString() {
        char[] chs = new char[2];
        for (int i = 0; i < chs.length; i++) {
            while (true) {
                char ch = (char) (Math.random() * ('z' + 1));
                if (Character.isLetter(ch) || Character.isDigit(ch)) {
                    chs[i] = ch;
                    break;
                }
            }
        }
        return new String(chs);
    }
}