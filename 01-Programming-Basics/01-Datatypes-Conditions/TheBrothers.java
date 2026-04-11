import java.util.*;

public class TheBrothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if(name1.split(" ")[1].equals(name2.split(" ")[1])) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
    }
}
