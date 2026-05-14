import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(primeFactors3(n).toString());
    }

    public static List<Integer> primeFactors1(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=1; i*i<=n; i++) {
            if(n%i == 0 && isPrime(i)) {
                res.add(i);
                if(n/i != i && isPrime(n/i))
                    res.add(n/i);
            }
        }

        return res;
    }

    public static List<Integer> primeFactors2(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            if(n%i == 0) {
                res.add(i);
                while(n%i == 0)
                    n /= i;
            }
        }
        return res;
    }

    public static List<Integer> primeFactors3(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=2; i*i<=n; i++) {
            if(n%i == 0) {
                res.add(i);
                while(n%i == 0)
                    n /= i;
            }
        }
        if(n != 1) res.add(n);
        return res;
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for(int i=1; i*i<=n; i++) {
            if(n%i == 0) {
                count++;
                if(n/i != i)
                    count++;
            }

            if(count > 2)
                break;
        }

        return count == 2;
    }
}
