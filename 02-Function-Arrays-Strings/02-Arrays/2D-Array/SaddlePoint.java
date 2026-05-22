import java.util.Scanner;

public class SaddlePoint {
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

        for(int i=0; i<arr.length; i++) {

            // find smallest number in the column
            int sj = 0;
            for(int j=1; j<arr[0].length; j++) {
                if(arr[i][j] < arr[i][j]) 
                    sj = j;
            }   

            boolean flag = true;
            for(int k=0; k<arr.length; k++) {
                if(arr[k][sj] > arr[i][sj]) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                System.out.println(arr[i][sj]);
                return;
            }
        }

        System.out.println(-1);
    }
}
