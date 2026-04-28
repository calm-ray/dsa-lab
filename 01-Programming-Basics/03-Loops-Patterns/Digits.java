import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t != 0) {
            String str = sc.nextLine();
            for(int i=str.length()-1; i>=0; i--) {
                System.out.print(str.charAt(i)+" ");
            }
            System.out.println();
            t--;
        }
    }
}
