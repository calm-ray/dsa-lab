import java.util.Scanner;

public class SuffixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(suffixSumInPlace(arr));
    }

    private static int suffixSumInPlace(int[] arr) {
        for(int i=arr.length-2; i>=0; i--) {
            arr[i] += arr[i+1];
        }

        return arr[0];
    }
}
