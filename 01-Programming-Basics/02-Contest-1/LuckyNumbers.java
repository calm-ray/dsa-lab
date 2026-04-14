import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int a1 = a/10;
        int a2 = a%10;
        
        if(a2==0 || a1%a2 == 0 || a2%a1 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
