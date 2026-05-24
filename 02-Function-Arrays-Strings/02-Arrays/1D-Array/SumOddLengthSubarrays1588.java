import java.util.Scanner;

public class SumOddLengthSubarrays1588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(sumOddLengthSubarraysBruteForce(arr));
        System.out.println(sumOddLengthSubarraysOptimized(arr));
    }

    private static int sumOddLengthSubarraysBruteForce(int[] arr) {
        int ans = 0;
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            int count = 0;
            for(int j=i; j<arr.length; j++) {
                sum += arr[j];
                count++;
                if(count % 2 != 0) {
                    ans += sum;
                }
            }
        }

        return ans;
    }

    private static int sumOddLengthSubarraysOptimized(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i] * ((((i+1)*(arr.length-i)) + 1) / 2);
        }

        return sum;
    }
}
