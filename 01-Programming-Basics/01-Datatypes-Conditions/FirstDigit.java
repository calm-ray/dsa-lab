import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println((x/1000)%2 == 0 ? "EVEN": "ODD");
    }
}
