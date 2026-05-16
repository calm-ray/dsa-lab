import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int base = sc.nextInt();

        System.out.println(anyBaseSubtraction(num1, num2, base));
    }

    public static int anyBaseSubtraction(int num1, int num2, int base) {
        int carry = 0;
        int res = 0;
        int multiplier = 1;
        while(num1 > 0 || num2 > 0 || carry > 0) {
            int rem1 = num1 % 10;
            int rem2 = num2 % 10;

            rem1 += carry;

            if(rem1 < rem2) {
                carry = -1;
                rem1 += base;
            } else {
                carry = 0;
            }
            int d = rem1 - rem2;

            res = res + d * multiplier;
            multiplier *= 10;

            num1 /= 10;
            num2 /= 10;
        }

        return res;
    }
}

