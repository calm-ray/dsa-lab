import java.util.Scanner;

public class NumHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int t = sc.nextInt();

        for(int i=1; i<=t; i++) {
            int x = sc.nextInt();

            for(int j=1; j<=x; j++)
                System.out.print(c);

            System.out.println();
        }
    }
}
