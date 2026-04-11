import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long max = Math.max(a, Math.max(b, c));
        long min = Math.min(a, Math.min(b, c));

        System.out.println(min+" "+max);
    }
}
