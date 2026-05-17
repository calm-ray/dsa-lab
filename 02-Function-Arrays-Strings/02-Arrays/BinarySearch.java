import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();
        System.out.println(binarySearch(arr, num));
    }

    public static boolean binarySearch(int[] arr, int num) {
        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {
            int mid = i + (j - i) / 2;

            if(num == arr[mid]) {
                return true;
            } else if(num < arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return false;
    }
}
