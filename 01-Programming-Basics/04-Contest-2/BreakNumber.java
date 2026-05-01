import java.util.Scanner;

public class BreakNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        int count = 0;
        while(t!=0) {
            long x = sc.nextLong();

            int ic = 0;
            while(x%2 == 0) {
                ic++;
                x = x/2;
            }

            count = Math.max(ic, count);
            t--;
        }

        System.out.println(count);
    }
}
