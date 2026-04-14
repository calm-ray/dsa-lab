import java.util.Scanner;

public class DataTypeGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();

        if((n*k)%a == 0) {
            if((n*k)/a <= 2147483647 && (n*k)/a>=-2147483648) {
                System.out.println("int");
            } else {
                System.out.println("long long");
            }
        } else {
            System.out.println("double");
        }
    }
}
