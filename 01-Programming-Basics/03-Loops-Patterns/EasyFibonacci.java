import java.util.Scanner;

public class EasyFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long a = 0;
        long b = 1;

        if(n == 1) {
            System.out.print(a+" ");
        } else if(n == 2) {
            System.out.print(a+" "+b);
        } else {
            System.out.print(a+" "+b+" ");
            for(int i=2; i<n; i++) {
                long c = a + b;
                System.out.print(c+" ");
                a = b;
                b = c;
            }
        }

    }
}
