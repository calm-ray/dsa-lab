import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // int[] res = rotateUsingExtraArray(arr, k);
        // for(int i=0; i<res.length; i++) {
        //     System.out.print(res[i]+" ");
        // }
        rotateInPlace(arr, k);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] rotateUsingExtraArray(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n];

        if(k < 0) {
            k = (k + n) % n;
        } else {
            k = k % n;
        }

        int index = n - k;
        int temp = index;
        int i = 0;
        while(i < res.length && index < n) {
            res[i++] = arr[index++];
        }

        int j = 0;
        while(i < res.length && j < temp) {
            res[i++] = arr[j++];
        }

        return res;
    }

    public static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if(k < 0)
            k += n;

        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
}
