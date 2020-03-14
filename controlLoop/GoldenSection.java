public class GoldenSection {
    public static void main(String[] args) {
        int son = 0, mother = 0;
        double min = 100;
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                if (i % 2 == 0 && j % 2 == 0) // 如果两个同时为偶数是跳出
                    continue;
                if (Math.abs(i * 1.0 / j - 0.618) < min) {
                    min = Math.abs(i * 1.0 / j - 0.618);
                    son = i;
                    mother = j;
                }
            }
        }
        System.out.println(son + "  " + mother);
    }
}