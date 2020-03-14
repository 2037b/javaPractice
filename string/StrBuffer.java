public class StrBuffer {
    public static void main(String[] args) {
        String str = "this";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println(strBuffer.length()); // content length;
        System.out.println(strBuffer.capacity()); // 总空间20
    }
}