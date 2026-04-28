import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        boolean v = false;
        for(long i=n; i<=m; i++) {
            long a = i;
            boolean flag = false;
            while(a > 0) {
                long x = a%10;
                if(x != 4 && x != 7) {
                    flag = true;
                } 
                a /= 10;
            }
            if(!flag) {
                System.out.print(i+" ");
                v = true;
            }
        }

        if(!v)
            System.out.println(-1);
    }
}
