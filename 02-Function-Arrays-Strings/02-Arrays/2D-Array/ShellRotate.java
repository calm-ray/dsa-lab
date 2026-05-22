import java.util.Scanner;

public class ShellRotate {
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

        int shell = sc.nextInt();
        int rotateBy = sc.nextInt();

        rotateShell(arr, shell, rotateBy);
        print(arr);

    }

    private static void rotateShell(int[][] arr, int shell, int rotateBy) {
        int[] oneD = prepareOneD(arr, shell);
        rotate(oneD, rotateBy);
        fillTwoD(arr, oneD, shell);
    }

    private static int[] prepareOneD(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int n = 2*(maxr - minr + maxc - minc);
        int[] oneD = new int[n];

        int c = 0;
        int index = 0;
        while(c < n) {
            for(int i=minr; i<=maxr && c<n; i++) {
                oneD[index++] = arr[i][minc];
                c++;
            }
            minc++;

            for(int i=minc; i<=maxc && c<n; i++) {
                oneD[index++] = arr[maxr][i];
                c++;
            }
            maxr--;

            for(int i=maxr; i>=minr && c<n; i--) {
                oneD[index++] = arr[i][maxc];
                c++;
            }
            maxc--;

            for(int i=maxc; i>=minc && c<n; i--) {
                oneD[index++] = arr[minr][i];
                c++;
            }
            minr++;
        }
        return oneD;
    }

    private static void fillTwoD(int[][] arr, int[] oneD, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int n = 2*(maxr - minr + maxc - minc);

        int c = 0;
        int index = 0;
        while(c < n) {
            for(int i=minr; i<=maxr && c<n; i++) {
                arr[i][minc] = oneD[index++];
                c++;
            }
            minc++;

            for(int i=minc; i<=maxc && c<n; i++) {
                arr[maxr][i] = oneD[index++];
                c++;
            }
            maxr--;

            for(int i=maxr; i>=minr && c<n; i--) {
                arr[i][maxc] = oneD[index++];
                c++;
            }
            maxc--;

            for(int i=maxc; i>=minc && c<n; i--) {
                arr[minr][i] = oneD[index++];
                c++;
            }
            minr++;
        }
    }

    private static void rotate(int[] oneD, int rotateBy) {
        int k = rotateBy % oneD.length;

        if(k < 0) {
            k += oneD.length;
        }

        reverse(oneD, 0, oneD.length - k - 1);
        reverse(oneD, oneD.length - k, oneD.length - 1);
        reverse(oneD, 0, oneD.length - 1);
    }

    private static void reverse(int[] oneD, int i, int j) {
        while(i < j) {
            int temp = oneD[i];
            oneD[i++] = oneD[j];
            oneD[j--] = temp;
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
