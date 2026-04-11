import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double r = a / b;

        System.out.println("floor "+(int)a+" / "+(int)b+" = "+(int)Math.floor(r));
        System.out.println("ceil "+(int)a+" / "+(int)b+" = "+(int)Math.ceil(r));
        System.out.println("round "+(int)a+" / "+(int)b+" = "+(int)Math.round(r));

    }

}
