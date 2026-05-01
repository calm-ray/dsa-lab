import java.util.Scanner;

public class DrawingX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = n/2;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==mid && j==mid)
                    System.out.print("X");
                else if(j==i)
                    System.out.print("\\");
                else if(j==n-i-1)
                    System.out.print("/");
                else
                    System.out.print("*");

            }
            System.out.println();
        }
    }
}
