public class Print {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int num = 5;
        float floatNum = 5.99F;
        char letter = 'D';
        boolean bool = true;
        String site = "jaywcjlove.github.io";
        String first = "John";
        String last = "Doe";
        String name = first + " " + last;
        System.out.printf("num=%d%n", Integer.valueOf(num));
        System.out.printf("floatNum=%f%n", floatNum);
        System.out.printf("letter=%c%n", letter);
        System.out.printf("bool=%b%n", bool);
        System.out.printf("site=%s%n", site);
        System.out.printf("first=%s%n", first);
        System.out.printf("last=%s%n", last);
        System.out.printf("name=%s%n", name);
        String word = "QuickRef";
        char[] var10 = word.toCharArray();
        int var11 = var10.length;

        for (int var12 = 0; var12 < var11; ++var12) {
            char c = var10[var12];
            System.out.print("" + c + "-");
        }
    }
}



