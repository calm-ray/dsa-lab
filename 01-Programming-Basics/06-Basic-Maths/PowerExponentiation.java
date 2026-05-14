import java.util.Scanner;

public class PowerExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        long ans = 1;

        while(x != 0) {
            if(x%2 != 0) {
                ans *= n;
                x -= 1;
            } else {
                x = x / 2;
                n = n * n;
            }
        }

        System.out.println(ans);
    }
}
