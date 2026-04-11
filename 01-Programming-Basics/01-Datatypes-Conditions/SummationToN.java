import java.util.*;
public class SummationToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((long)(n*(n+1))/2);
    }
}