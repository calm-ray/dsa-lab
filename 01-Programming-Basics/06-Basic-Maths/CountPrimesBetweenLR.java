import java.util.Scanner;

public class CountPrimesBetweenLR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        int[][] queries = new int[q][2];
        for(int i=0; i<q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        // Build Sieve of Eratoshthenes table for 10^6
        int[] primes = getSeive((int) 1e6);

        // Do prefix sum
        int count = 0;
        for(int i=2; i<=1e6; i++) {
            count += primes[i];
            primes[i] = count;
        }

        // Find prime count in range
        for(int i=0; i<queries.length; i++) {
            System.out.println(primes[queries[i][1]] - primes[queries[i][0] - 1]);
        }
    }

    public static int[] getSeive(int n) {
        int[] primes = new int[n+1];

        for(int i=2; i<primes.length; i++)
            primes[i] = 1;

        for(int i=2; i*i<=n; i++) {
            if(primes[i] == 1) {
                for(int j=i*i; j<=n; j+=i) {
                    primes[j] = 0;
                }
            } 
        }
        return primes;
    }
}
