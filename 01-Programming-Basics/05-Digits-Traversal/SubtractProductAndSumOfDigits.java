import java.util.Scanner;

public class SubtractProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        long product = 1;
        long sum = 0;

        while(n > 0) {
            int d = n % 10;
            product *= d;
            sum += d;
            n /= 10;
        }

        return (int)(product - sum);
    }
}
