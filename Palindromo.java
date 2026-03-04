public class Palindromo {
    public static void main(String[] args) {
        System.out.println(palindromo("abbbbbba"));
    }

    static boolean palindromo(String str) {
        if (str.length() <= 1)
            return true;
        return str.charAt(0) != str.charAt(str.length() - 1) ? false : palindromo(str.substring(1, str.length() - 1));
    }
}
