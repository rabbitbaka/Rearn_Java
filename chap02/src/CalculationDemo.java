public class CalculationDemo {
    public static void main(String[] args) {
        int i;
        long l;
        double d;

        i = 5/2;
        System.out.println("5/2 : " + i); // 2

        d = 5.0/2.0;
        System.out.println("5/2 : " + d); // 2.5

        l = 10_000_000 * (long)10_000_000;
        l = 10_000_000 * 10_000_000L;
        System.out.println(l);
    }
}
