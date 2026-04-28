import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        long sum = 0;
        for(int i=1; i<=n; i++) {
            int x = i;
            int s = 0;
            while(x > 0) {
                int d = x % 10;
                s += d;
                x /= 10;
            }

            if(s>=a && s<=b) 
                sum += i;
        }

        System.out.println(sum);
    }
}
