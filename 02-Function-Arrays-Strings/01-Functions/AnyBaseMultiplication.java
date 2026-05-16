import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(anyBaseMultiplication(n1, n2, b));
    }

    public static int anyBaseMultiplication(int n1, int n2, int b) {
        
        int r2 = 0;
        int m2 = 1;
        while(n2 > 0) {
            int rem2 = n2 % 10;

            int m1 = 1;
            int r1 = 0;
            int t1 = n1;
            int carry = 0;
            while (t1 > 0) {
                int rem1 = t1 % 10;
                int d = (rem1 * rem2) + carry;

                carry = d / b;
                d = d % b;

                r1 += d * m1;
                m1 *= 10;
                
                t1 /= 10;
            }

            r1 *= m2;
            r2 = anyBaseAddition(r1, r2, b);

            m2 *= 10;
            n2 /= 10;
        }

        return r2;
    }

    public static int anyBaseAddition(int n1, int n2, int b) {
        int carry = 0;
        int multiplier = 1;
        int res = 0;
        while(n1 > 0 || n2 > 0 || carry > 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;

            int d = rem1 + rem2 + carry;
            carry = d / b;
            d = d % b;

            res += d * multiplier;
            multiplier *= 10;

            n1 /= 10;
            n2 /= 10;
        }

        return res;
    }
}
