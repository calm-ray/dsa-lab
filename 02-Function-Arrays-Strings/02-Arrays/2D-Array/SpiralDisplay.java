import java.util.Scanner;

public class SpiralDisplay {
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

		printSpiral(arr);
	}

	private static void printSpiral(int[][] arr) {
		int i1 = 0, i2 = arr.length - 1;
		int j1 = 0, j2 = arr[0].length - 1;

		int count = 0;
		int tne = arr.length * arr[0].length;
		while(count < tne) {

			// i1 to i2
			for(int k=i1; k<=i2 && count < tne; k++) {
				System.out.println(arr[k][j1]);
				count++;
			}
			j1++;

			// j1 to j2 ... increase j1
			for(int k=j1; k<=j2 && count < tne; k++) {
				System.out.println(arr[i2][k]);
				count++;
			}
			i2--;

			// i2 to i1 ... decrease j2
			for(int k=i2; k>=i1 && count < tne; k--) {
				System.out.println(arr[k][j2]);
				count++;
			}
			j2--;

			// j2 to j1 ... decrease i1
			for(int k=j2; k>=j1 && count < tne; k--) {
				System.out.println(arr[i1][k]);
				count++;
			}
			i1++;
		}
	}
}
