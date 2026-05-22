import java.util.Scanner;

public class InverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = new int[arr.length];

        for(int i=0; i<res.length; i++) {
            res[arr[i]] = i;
        }
        
        for(int k=0; k<res.length; k++) {
            System.out.print(res[k]+" ");
        }
    }
}
