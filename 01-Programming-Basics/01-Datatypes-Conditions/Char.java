import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 65 && ch <= 90) {
            System.out.println((char)(ch+32));
        } else if (ch >= 97 && ch <= 122) {
            System.out.println((char)(ch-32));
        }
    }
}
