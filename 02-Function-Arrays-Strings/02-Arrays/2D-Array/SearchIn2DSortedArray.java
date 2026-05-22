import java.util.Scanner;

public class SearchIn2DSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        if(r!=c) {
            System.out.println(-1);
            return;
        }

        int[][] arr = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        int i=0, j=arr[0].length - 1;
        while (i<arr.length && j>=0) {
            if(x == arr[i][j]) {
                System.out.println(i+" "+j);
                return;
            } else if(x > arr[i][j]) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(-1);
    }
}
