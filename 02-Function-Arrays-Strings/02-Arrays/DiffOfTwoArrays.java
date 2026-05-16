import java.util.Scanner;

public class DiffOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for(int i=0; i<n; i++)
            arr1[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i=0; i<m; i++)
            arr2[i] = sc.nextInt();

        int[] res = new int[m];

        int carry = 0;
        int i = arr2.length - 1;
        int j = arr1.length - 1;
        int k = res.length - 1;

        while(i>=0 && j>=0 && k>=0) {
            int val = arr2[i] + carry;

            if(val < arr1[j]) {
                val += 10;
                carry = -1;
            } else {
                carry = 0;
            }

            int diff = val - arr1[j];

            res[k] = diff;

            i--; j--; k--;
        }

        while(i>=0 && k>=0) {
            int val = arr2[i] + carry;

            if(val < 0) {
                val += 10;
                carry = -1;
            } else {
                carry = 0;
            }

            res[k] = val;

            i--; k--;
        }

        while(res[++k] == 0) {}

        for(; k<res.length; k++) {
            System.out.print(res[k]);
        }
    }
}
