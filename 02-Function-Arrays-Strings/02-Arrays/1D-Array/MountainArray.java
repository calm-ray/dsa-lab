import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 3)
            return;

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int p1=-1, p2=arr.length;
        boolean fromStart = true;
        
        for(int i=0; i<arr.length-1 && fromStart; i++) {
            if(arr[i] >= arr[i+1]) {
                fromStart = false;
                break;
            }
            p1 = i+1;
        }

        boolean fromEnd = true;
        for(int i=arr.length-1; i>=1 && fromEnd; i--) {
            if(arr[i-1] <= arr[i]) {
                fromEnd = false;
                break;
            }
            p2 = i-1;
        }

        boolean isMountainArray = true;

        if(p1 != p2)
            isMountainArray = false;
        
        System.out.println(isMountainArray);
    }
}
