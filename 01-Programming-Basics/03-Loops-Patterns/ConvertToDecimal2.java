import java.util.Scanner;

public class ConvertToDecimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t != 0) {
            int n = sc.nextInt();

            long num = 0;
            long count = 0;
            while(n != 0) {
                num = num + (long) Math.pow(2, count);
                n = n & (n-1);
                count++;
            }

            System.out.println(num);
            t--;
        }
    }
}
