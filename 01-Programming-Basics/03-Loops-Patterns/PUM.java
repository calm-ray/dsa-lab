import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=4; j++)
                if(j%4 == 0) {
                    System.out.print("PUM");
                    x++;
                } else {
                    System.out.print(x++ +" ");
                }
            System.out.println();
        }
    }
}
