import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j] = sc.nextInt();

        for(int j=0; j<arr[0].length; j++) {
            if(j%2 == 0) {
                int i = 0;
                while(i < arr.length)
                    System.out.print(arr[i++][j]+" ");
            } else {
                int i = arr.length - 1;
                while(i >= 0) 
                    System.out.print(arr[i--][j]+" ");
            }
        }
    }
}
