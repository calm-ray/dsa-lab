import java.util.Scanner;

public class FloatOrInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble();

        String str = String.valueOf(d);
        String[] strArr = str.split("[.]");
        

        if(strArr[1].equals("0")) {
            System.out.println("int "+strArr[0]);
        } else {
            System.out.println("float "+strArr[0]+" 0."+strArr[1]);
        }
    }
}
