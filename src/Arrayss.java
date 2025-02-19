import java.util.Arrays;
public class Arrayss {

    public static void main(String[] args){
        char[] chars = new char[10];
        System.out.println(chars);
        chars[0] = 'a';
        System.out.println(chars);
        chars[1] = 'b';
        System.out.println(chars);
        String[] letters = {"A", "B", "C"};
        System.out.println(Arrays.toString(letters));
        int[] mylist = {100, 200};
        System.out.println(Arrays.toString(mylist));
        boolean[] answers = {true, false};
        System.out.println(Arrays.toString(answers));

    }
}
