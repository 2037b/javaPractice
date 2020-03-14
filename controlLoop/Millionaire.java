public class Millionaire{
    public static void main(String[] args) {
        int p=24000;
        double r=0.2;
        int n=1;
        double f=p*(1+r);
        while(f<1_000_000){
            n++;
            f=f*(1+r);
        }
        System.out.println(n);
    }
}