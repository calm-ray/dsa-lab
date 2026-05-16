import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fromBase = sc.nextInt();
        int toBase = sc.nextInt();

        int decimalNum = convertToDecimal(num, fromBase);
        System.out.println(convertDecimalToBase(decimalNum, toBase));
    }

    public static int convertToDecimal(int num, int base) {
        int res = 0;
        int multiplier = 1;
        while(num > 0) {
            int digit = num % 10;
            res += digit * multiplier;
            multiplier *= base;
            num /= 10;
        }

        return res;
    }

    public static int convertDecimalToBase(int num, int base) {
        
        int res = 0;
        int multiple = 1;
        while(num > 0) {
            int remainder = num % base;
            res = res + (remainder * multiple);
            multiple *= 10;
            num /= base;
        }

        return res;
    }
}
