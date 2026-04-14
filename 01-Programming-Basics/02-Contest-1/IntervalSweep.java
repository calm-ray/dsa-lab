import java.util.Scanner;

public class IntervalSweep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = a > b ? a-b : b-a;

        if(res > 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
