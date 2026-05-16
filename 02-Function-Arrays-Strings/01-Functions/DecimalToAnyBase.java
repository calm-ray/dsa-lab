import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        System.out.println(convertDecimalToBase(num, base));
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
