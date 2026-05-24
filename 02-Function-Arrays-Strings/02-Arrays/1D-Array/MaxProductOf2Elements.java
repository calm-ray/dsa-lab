import java.util.Scanner;

public class MaxProductOf2Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= largest) {
                slargest = largest;
                largest = arr[i];
            } else if(arr[i] > slargest) {
                slargest = arr[i];
            }

            if(arr[i] <= smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }

        int ans1 = largest * slargest;
        int ans2 = smallest * ssmallest;

        System.out.println(Math.max(ans1, ans2));
    }
}
