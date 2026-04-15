import java.util.Scanner;

public class FixedPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int x = sc.nextInt();
            if(x == 1999) {
                System.out.println("Correct");
                break;
            }
            System.out.println("Wrong");
        }
    }
}
