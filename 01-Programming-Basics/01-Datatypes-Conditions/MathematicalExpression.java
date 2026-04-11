import java.util.Scanner;

public class MathematicalExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char s = sc.next().charAt(0);
        int b = sc.nextInt();
        char q = sc.next().charAt(0);
        int c = sc.nextInt();

        if(s=='+') {
            if((a+b) == c)
                System.out.println("Yes");
            else 
                System.out.println(a+b);
        } else if(s=='-') {
            if((a-b) == c)
                System.out.println("Yes");
            else 
                System.out.println(a-b);
        } else if(s=='*') {
            if((a*b) == c)
                System.out.println("Yes");
            else 
                System.out.println(a*b);
        }

    }
}
