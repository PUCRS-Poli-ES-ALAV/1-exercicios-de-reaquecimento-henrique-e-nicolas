public class CalcSla {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            System.out.println(calc(i));
        }
    }

    static double calc(double quant) {
        if (quant <= 1)
            return 1;
        return ((double) 1) / quant + calc(quant - 1);
    }
}
