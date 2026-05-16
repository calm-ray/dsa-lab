import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        System.out.println(convertToDecimal(num, base));
    }

    public static int convertToDecimal(int num, int base) {
        int res = 0;
        int multiple = 0;
        while(num > 0) {
            int digit = num % 10;
            res += digit * Math.pow(base, multiple++);
            num /= 10;
        }

        return res;
    }
}
