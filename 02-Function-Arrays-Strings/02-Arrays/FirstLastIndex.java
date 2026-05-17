import java.util.Scanner;

public class FirstLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int fi = firstIndex(arr, k);
        int li = lastIndex(arr, k);

        System.out.println(fi+" "+li);
    }

    public static int firstIndex(int[] arr, int k) {
        int i = 0;
        int j = arr.length - 1;
        
        int pi = -1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(k > arr[mid]) {
                i = mid + 1;
            } else if(k < arr[mid]) {
                j = mid - 1;
            } else {
                pi = mid;
                j = mid - 1;
            }
        }

        return pi;
    }

    public static int lastIndex(int[] arr, int k) {
        int i = 0;
        int j = arr.length - 1;
        
        int pi = -1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(k > arr[mid]) {
                i = mid + 1;
            } else if(k < arr[mid]) {
                j = mid - 1;
            } else {
                pi = mid;
                i = mid + 1;
            }
        }

        return pi;
    }
}
