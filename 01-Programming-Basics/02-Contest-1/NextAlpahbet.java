import java.util.Scanner;

public class NextAlpahbet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.next().charAt(0);

        char next_c = (char) (((ch - 97 + 1) % 26) + 97);
        System.out.println(next_c);
    }
}
