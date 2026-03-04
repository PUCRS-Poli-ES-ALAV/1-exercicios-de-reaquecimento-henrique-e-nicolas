public class Soma2Nat {
    public static void main(String[] args) {
        System.out.println(somanat(3, 2));
        System.out.println(somanat2(2, 3));
    }

    static int somanat(int n1, int n2) {
        if (n1 <= 0 && n2 <= 0)
            return 0;
        else if (n1 <= 0)
            return 1 + somanat(n1, n2 - 1);
        return 1 + somanat(n1 - 1, n2);

    }

    static int somanat2(int n1, int n2) {
        if (n2 == 0)
            return n1;
        return somanat2(n1 + 1, n2 - 1);
    }
}
