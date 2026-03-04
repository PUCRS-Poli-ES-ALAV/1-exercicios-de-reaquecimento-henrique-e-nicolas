public class Ackerman {
    public static void main(String[] args) {
        System.out.println(ackerman(3, 100));
    }

    static double ackerman(double n1, double n2) {
        if (n1 != 0 && n2 != 0)
            return ackerman(n1 - 1, ackerman(n1, n2 - 1));
        if (n1 == 0)
            return n2 + 1;
        if (n2 == 0)
            return ackerman(n1 - 1, 1);
        return 0;
    }
}
