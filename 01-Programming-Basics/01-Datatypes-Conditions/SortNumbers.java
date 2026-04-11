import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long[] arr = {a, b, c};
        Arrays.sort(arr);

        LongStream.of(a, b, c).sorted().forEach(System.out::println);
        System.out.println();
        LongStream.of(a, b, c).forEach(System.out::println);
    }
}
