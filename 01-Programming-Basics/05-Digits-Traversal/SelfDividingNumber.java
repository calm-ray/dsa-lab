import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelfDividingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        System.out.println(selfDividingNumbers(left, right).toString());
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isDivisible(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static boolean isDivisible(int num) {

        int temp = num;

        while (temp > 0) {

            int rem = temp % 10;

            if (rem == 0 || num % rem != 0) {
                return false;
            }

            temp /= 10;
        }

        return true;
    }
}