public class TypeCasting {
    public static void main(String[] args) {
        // Widening
        // byte<short<int<long<float<double
        int i = 10;
        System.out.println("i=" + i);
        long l = i;               // 10
        System.out.println("l=" + l);
        // Narrowing
        double d = 10.02;
        System.out.println("doubled=" + d);
        l = (long) d;// 10
        System.out.println("longl=" + l);
        System.out.println("String.valueOf(10)=" + String.valueOf(10));// "10"
        System.out.println("Integer.parseInt('10')" + Integer.parseInt("10")); // 10
        System.out.println("Double.parseDouble('10')" + Double.parseDouble("10")); // 10.0
    }
}
