import java.util.Scanner;

public class TwoIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l1 = sc.nextLong();
        long r1 = sc.nextLong();
        long l2 = sc.nextLong();
        long r2 = sc.nextLong();

        if(r1 < l2 || r2 < l1) {
            System.out.println(-1);
        } else {
            if(l1 <= l2) {
                if(r1 <= r2) {
                    System.out.println(l2+" "+r1);
                } else {
                    System.out.println(l2+" "+r2);
                }
            } else {
                if(r1 >= r2) {
                    System.out.println(l1+" "+r2);
                } else {
                    System.out.println(l1+" "+r1);
                }
            }
            
        }
    }
}
