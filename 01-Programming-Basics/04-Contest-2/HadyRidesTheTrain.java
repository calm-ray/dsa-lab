import java.util.Scanner;

public class HadyRidesTheTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long quotient = n / 4;
        long remainder = n % 4;

        if(quotient%2 != 0)
            remainder = 3 - remainder;

        System.out.println(quotient+" "+remainder);
    }
}
