import java.util.Scanner;

public class TheLast2Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        a %= 100;
        b %= 100;
        c %= 100;
        d %= 100;

        long p = a * b * c * d;

        if(p%100 <= 9)
            System.out.print(0);
        System.out.println(p%100);
    }
}