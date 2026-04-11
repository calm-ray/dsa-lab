import java.util.*;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long result = (a*b) - (c*d);
        System.out.println("Difference = "+result);
    }
}
