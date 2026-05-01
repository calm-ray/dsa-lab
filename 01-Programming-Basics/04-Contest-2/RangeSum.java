import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t!=0) {
            long aa = sc.nextLong();
            long bb = sc.nextLong();

            long a = Math.min(aa, bb);
            long b = Math.max(aa, bb);

            //long sum = (((b*(b+1))/2) - (((a-1)*a)/2)); // sum of natural numbers till b - sum of natural number till a-1
            long sum = ((b-a+1) * (a+b)) / 2; // gauss
            System.out.println(sum);
            t--;
        }
    }
}
