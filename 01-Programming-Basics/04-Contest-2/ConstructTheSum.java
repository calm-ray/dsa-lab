import java.util.Scanner;

public class ConstructTheSum {
    static int[] res = new int[1000005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextLong()) {
            long counter = sc.nextLong();
            long cou = 0;

            for (int i = 0; i < counter; i++) {
                long num1 = sc.nextLong();
                long num2 = sc.nextLong();

                // Check if the sum of 1 to num1 is less than num2
                if (num1 * (num1 + 1) / 2 < num2) {
                    System.out.print("-1");
                } else {
                    long sum = 0;

                    // Greedy loop starting from num1 down to 1
                    for (int z = (int) num1; z >= 1; z--) {
                        if (sum + z <= num2) {
                            sum += z;
                            res[(int) cou] = z;
                            cou++;
                        }
                        if (sum == num2) {
                            break;
                        }
                    }
                }

                // Print the resulting summands
                for (int x = 0; x < cou; x++) {
                    System.out.print(res[x] + " ");
                }
                System.out.println();
                
                // Reset counter for the next test case
                cou = 0;
            }
        }
        sc.close();
    }
}