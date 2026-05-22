import java.util.Scanner;

public class CeilFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();
        ceilFloor(arr, num);
    }

    public static void ceilFloor(int[] arr, int num) {
        int i = 0;
        int j = arr.length - 1;

        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;

        while(i <= j) {
            int mid = i + (j - i) / 2;

            if(num == arr[mid]) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } else if(num < arr[mid]) {
                ceil = arr[mid];
                j = mid - 1;
            } else {
                floor = arr[mid];
                i = mid + 1;
            }
        }

        System.out.println(floor+" "+ceil);
    }
}
