import java.util.Scanner;

public class RotateByNinety {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        transpose(arr);
        reverse(arr);
        print(arr);
    }

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            int j=0, k=arr[i].length-1;
            while(j<k) {
                int temp = arr[i][j];
                arr[i][j++] = arr[i][k];
                arr[i][k--] = temp;
            }
        }
    }

    public static void print(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
