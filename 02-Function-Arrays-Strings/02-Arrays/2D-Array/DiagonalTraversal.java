import java.util.Scanner;

public class DiagonalTraversal {
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

        for(int g=0; g<arr.length; g++) {
            for(int i=0, j=g; j<arr[0].length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
