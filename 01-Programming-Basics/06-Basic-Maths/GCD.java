import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Brute-Force
        int gcd = 1;
        for(int i=1; i<=Math.min(a, b); i++) {
            if(a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);

        // Optimal - Euclidean
        // gcd(a, b) = gcd(a-b, b) where a > b
        // can be optimized by gcd(a, b) = gcd(a%b, b) where a > b
        while(a>0 && b>0) {
            if(a>b) a = a % b;
            else b = b % a;
        }

        if(a==0)
            System.out.println(b);
        else
            System.out.println(a);
    }
    
}
