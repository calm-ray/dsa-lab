import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArr = str.split("[<>=\\s]+");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);

        if(str.contains("<")) {
            System.out.println(a<b?"Right":"Wrong");
        } else if(str.contains(">")) {
            System.out.println(a>b?"Right":"Wrong");
        } else if(str.contains("=")) {
            System.out.println(a==b?"Right":"Wrong");
        } 
    }
}
