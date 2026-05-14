import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorisationOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] queries = new int[n];

        for(int i=0; i<n; i++) {
            queries[i] = sc.nextInt();
        }

        int[] sbf = getSbf((int) 1e6);

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<queries.length; i++) {
            List<Integer> temp = new ArrayList<>();
            int num = queries[i];
            while(num!=1) {
                temp.add(sbf[num]);
                num /= sbf[num];
            }

            res.add(temp);
        }

        System.out.println(res.toString());
    }

    public static int[] getSbf(int n) {
        int[] sbf = new int[n+1];

        for(int i=0; i<=n; i++)
            sbf[i] = i;

        for(int i=2; i*i<=n; i++){
            if(sbf[i] == i) {
                for(int j=i*i; j<=n; j+=i) {
                    if(sbf[j] == j) {
                        sbf[j] = i;
                    }
                }
            }
        }

        return sbf;
    }
}
