public class InvertString {
    public static void main(String[] args) {
        System.out.println(inverte("abc"));
    }

    static String inverte(String invertendo) {
        if (invertendo.isEmpty())
            return "";
        return invertendo.charAt(invertendo.length() - 1) + inverte(invertendo.substring(0, invertendo.length() - 1));
    }
}
