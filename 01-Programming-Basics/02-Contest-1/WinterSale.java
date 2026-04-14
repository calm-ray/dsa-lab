import java.text.DecimalFormat;
import java.util.*;

public class WinterSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long p = sc.nextLong();

        double a = (p*100.0) / (100.0-x);

        // DecimalFormat df = new DecimalFormat("0.00");
        // System.out.println(df.format(a));
        System.out.format("%.2f", a);
    }
}
