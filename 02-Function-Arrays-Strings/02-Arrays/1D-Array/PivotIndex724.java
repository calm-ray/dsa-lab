import java.util.Scanner;

public class PivotIndex724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = prefix(arr);
        int[] suffix = suffix(arr);

        System.out.println(pivotIndex(prefix, suffix));
    }

    private static int pivotIndex(int[] prefix, int[] suffix) {
        for(int i=0; i<prefix.length; i++) {
            if(prefix[i] == suffix[i])
                return i;
        }

        return -1;
    }

    private static int[] suffix(int[] arr) {
        int[] suffix = new int[arr.length];
        suffix[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--) {
            suffix[i] = arr[i] + suffix[i+1];
        }

        return suffix;
    }

    private static int[] prefix(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefix[i] = arr[i] + prefix[i-1];
        }

        return prefix;
    }
}
