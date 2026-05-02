import java.util.Scanner;

public class CountDigitsThatDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int nn = n;
        int lastDigit = -1;
        while(n != 0) {
            int d = n % 10;
            if(d == lastDigit || d == 0) {
                n = n / 10;
                continue;
            }
            if(nn%d == 0)
                count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}