import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(prefixSumExtraSpace(arr));
        System.out.println(prefixSumInPlace(arr));
    }

    private static int prefixSumExtraSpace(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i<arr.length; i++) {
            prefix[i] = arr[i] + prefix[i-1];
        }

        return prefix[arr.length - 1];
    }

    private static int prefixSumInPlace(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            arr[i] += arr[i-1];
        }

        return arr[arr.length - 1];
    }
}
