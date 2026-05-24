import java.util.Scanner;

public class FindHighestAltitude1732 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(largestAltitude(arr));
    }

    private static int largestAltitude(int[] gain) {
        int altitude = 0, ans = 0;

        for(int i=0; i<gain.length; i++) {
            altitude += gain[i];
            ans = Math.max(ans, altitude);
        }

        return ans;
    }
}
