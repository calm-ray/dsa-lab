import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int num = 0, n = x;
        while(x > 0) {
            int d = x % 10;
            num = num * 10 + d;
            x /= 10;
        }
        if(num == n)
            return true;
        else 
            return false;
    }
}
