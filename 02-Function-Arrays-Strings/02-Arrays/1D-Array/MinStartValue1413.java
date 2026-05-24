import java.util.Scanner;

public class MinStartValue1413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minStartVal(arr));
    }

    private static int minStartVal(int[] arr) {
        int min = 1;
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            min = Math.min(min, sum);
        }

        if(min > 0) return 1;

        return (min * -1) + 1;
    }
}
