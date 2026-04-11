import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArr = str.split("[-+*/]+");
        long a = Long.parseLong(strArr[0]);
        long b = Long.parseLong(strArr[1]);
        if(str.contains("+")) {
            System.out.println(a+b);
        } else if(str.contains("-")) {
            System.out.println(a-b);
        } else if(str.contains("*")) {
            System.out.println(a*b);
        } else if(str.contains("/")) {
            System.out.println(a/b);
        }
    }
}
