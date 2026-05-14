import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dup = n;
        int num = 0;
        int noOfDigits = (int) Math.floor(Math.log10(n)+1);
        while(n > 0) {
            int d = n%10;
            num += (int) Math.pow(d, noOfDigits);
            n /= 10;
        }

        if(dup == num)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
