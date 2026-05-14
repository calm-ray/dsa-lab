import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int count = 0;
        // while(n > 0) {
        //     count++;
        //     n /= 10;
        // }

        // System.out.println(count);

        // Optimal
        System.out.println((int) Math.floor(Math.log10(n)+1));
    }
}
