import java.util.Scanner;

public class SumOfConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t != 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            long max = Math.max(x, y);
            long min = Math.min(x, y);

            long sum = 0;

            for(long i=min+1; i<max; i++) {
                if(i%2 != 0)
                    sum += i;
            }
            System.out.println(sum);
            t--;
        }
    }
}
