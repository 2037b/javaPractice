public class TimeConsuming {
    public static void main(String[] args) {
        String str = "";
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            char ch = (char) (Math.random() * Character.MAX_VALUE);
            str += ch;
        }
        System.out.println(System.currentTimeMillis() - time);
        StringBuffer strBuff = new StringBuffer(str);
        long timeBuff = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            char ch = (char) (Math.random() * Character.MAX_VALUE);
            strBuff.append(ch);
        }
        System.out.println(System.currentTimeMillis() - timeBuff);
    }
}