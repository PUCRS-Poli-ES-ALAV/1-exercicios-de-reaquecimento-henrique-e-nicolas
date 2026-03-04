public class VetorSomaProd {
    public static void main(String[] args) {
        System.out.println(calc(new int[] { 1, 2, 3 }, new int[] { 0, 1 }, 0)[0]);
    }

    static int[] calc(int[] arr, int[] results, int counter) {
        if (arr.length == counter)
            return results;
        return calc(arr, new int[] { (results[0] + arr[counter]), (results[1] * arr[counter]) }, counter + 1);
    }
}
