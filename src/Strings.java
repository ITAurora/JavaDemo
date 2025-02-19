public class Strings {
    public static void main(String[] args) {
        String str1 = "value";
        String str2 = new String("value");
        String str3 = String.valueOf(123);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        String s = 3 + "str" + 3;     // 3str3
        System.out.println(s);
        s = 3 + 3 + "str";     // 6str
        System.out.println(s);
        s = "3" + 3 + "str";   // 33str
        System.out.println(s);
        s = "3" + "3" + "23";  // 3323
        System.out.println(s);
        s = "" + 3 + 3 + "23"; // 3323
        System.out.println(s);
        int l = 3 + 3 + 23;        // 29
        System.out.println(l);
    }
}
