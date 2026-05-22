import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] res = new int[n > m ? n : m];

        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = res.length - 1;

        while(i >= 0 && j >= 0 && k >= 0) {
            int d = arr1[i] + arr2[j] + carry;
            res[k] = d % 10;
            carry = d / 10;
            i--; j--; k--;
        }

        while(i >= 0 && k >= 0) {
            int d = arr1[i] + carry;
            res[k] = d % 10;
            carry = d / 10;
            i--; k--;
        }

        while(j >= 0 && k >= 0) {
            int d = arr2[j] + carry;
            res[k] = d % 10;
            carry = d / 10;
            j--; k--;
        }

        if(carry > 0)
            System.out.print(carry);

        for(k=0; k<res.length; k++)
            System.out.print(res[k]);
    }
}
