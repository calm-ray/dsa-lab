import java.util.Scanner;

public class Katryoshka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long e = sc.nextLong();
        long m = sc.nextLong();
        long b = sc.nextLong();

        long res = 0;
        
        long thirdReceipe  = Math.min(e, Math.min(m, b));
        res += thirdReceipe;

        long firstReceipe = Math.min((e-thirdReceipe)/2, b-thirdReceipe);
        res += firstReceipe;

        System.out.println(res);
    }
}
