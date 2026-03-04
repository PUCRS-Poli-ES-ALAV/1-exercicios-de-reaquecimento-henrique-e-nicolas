public class Multi2Num {
    public static void main(String[] args) {
        System.out.println(recMulti(10, 10));
    }

    static int recMulti(int num, int multi) {
        if (multi > 0)
            return num + recMulti(num, multi - 1);
        return 0;
    }
}
