import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long n1 = n;

        long res = 0;
        while(n1!=0) {
            long d = n1 % 10;
            res = (res * 10) + d;
            n1 /= 10;
        }

        System.out.println(res);
        if(res == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
