import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Brute-force
        for(int i=1; i<=n; i++) {
            if(n % i == 0)
            System.out.print(i+" ");
        }

        System.out.println();

        // Optimal - O(sqrt(n) + O(nof log nof))
        List<Integer> factors = new ArrayList<>();
        for(int i=1; i*i <= n; i++) {
            if(n%i == 0) {
                factors.add(i);
                if(n/i != i)
                    factors.add(n/i);
            }
        }

        Collections.sort(factors);

        System.out.println(factors);
    }
}
