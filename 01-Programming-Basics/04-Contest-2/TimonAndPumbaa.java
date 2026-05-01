import java.util.Scanner;

public class TimonAndPumbaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long diff = a - b;

        if(diff >= 0) 
            System.out.println(diff);
        else
            System.out.println(0);
    }
}
