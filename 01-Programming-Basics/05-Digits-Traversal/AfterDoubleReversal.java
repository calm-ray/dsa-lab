import java.util.Scanner;

public class AfterDoubleReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isSameAfterReversals(num));
    }

    public static boolean isSameAfterReversals(int num) {
        if(num == 0)
            return true;
        
        if(num % 10 == 0)
            return false;
        return true;
    }
}
