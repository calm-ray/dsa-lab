import java.util.Scanner;

public class FindingMinimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long min = Long.MAX_VALUE;
        for(int i=1; i<=n; i++) {
            long val = sc.nextLong();
            min = Math.min(val, min);

            if(i%k == 0) {
                System.out.print(min+" ");
                min = Long.MAX_VALUE;
            }
        }

        if(min != Long.MAX_VALUE)
            System.out.println(min);
    }
}
