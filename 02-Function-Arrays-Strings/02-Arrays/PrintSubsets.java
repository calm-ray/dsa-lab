import java.util.Scanner;

public class PrintSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<Math.pow(2, arr.length); i++) {

            int temp = i;
            String set = "";
            for(int j=arr.length - 1; j>=0; j--) {
                int rem = temp % 2;
                temp = temp / 2;

                if(rem == 0)
                    set = "_\t" + set;
                else
                    set = arr[j] + "\t" + set ;
            }

            System.out.println(set);
        }
    }
}
