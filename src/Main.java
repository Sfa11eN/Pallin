import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String wort ="уверен и не реву";
        char[] warray =wort.toCharArray();
        System.out.println(Arrays.toString(warray));
        System.out.println(Palindrom.istPalindrome(warray));


    }
}
