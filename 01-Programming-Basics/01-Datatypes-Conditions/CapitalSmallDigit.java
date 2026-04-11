import java.util.*;

public class CapitalSmallDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int) sc.next().charAt(0);

        if(a >= 48 && a <= 57) {
            System.out.println("IS DIGIT");
        } else {
            System.out.println("ALPHA");
            if (a >= 65 && a <= 90) {
                System.out.println("IS CAPITAL");
            } else if (a >= 97 && a <= 122) {
                System.out.println("IS SMALL");
            }
        }
    }
}
