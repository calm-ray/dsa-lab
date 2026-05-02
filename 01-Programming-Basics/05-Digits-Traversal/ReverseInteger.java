import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 0;
        boolean negative = false;

        if (n < 0) {
            n = -n;
            negative = true;
        }
        while (n != 0) {
            int a = n % 10;
            if (num > (Integer.MAX_VALUE - a) / 10)
                System.out.println(0);
            num = num * 10 + a;
            n = n / 10;
        }

        if(negative)
            System.out.println(-num);
        else
            System.out.println(num);
    }
}
