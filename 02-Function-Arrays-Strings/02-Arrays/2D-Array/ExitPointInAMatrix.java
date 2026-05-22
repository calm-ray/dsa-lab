import java.util.Scanner;

public class ExitPointInAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printExitPoint(arr);
    }

    public static void printExitPoint(int[][] arr) {
        int dir = 0;

        int i = 0, j = 0;
        while(true) {
            dir = (dir + arr[i][j]) % 4;
            if(dir == 0) {
                j++; 
            } else if(dir == 1) {
                i++;
            } else if(dir == 2) {
                j--;
            } else if(dir == 3) {
                i--;
            }

            if(i < 0) {i++; break;} 
            if(i == arr.length) {i--; break;}
            if(j < 0) {j++; break;}
            if(j == arr[0].length) {j--; break;}
        }
        System.out.println(i+" "+ j);
    }
}
