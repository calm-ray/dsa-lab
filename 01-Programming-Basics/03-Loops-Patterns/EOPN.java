import java.util.Scanner;

public class EOPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int e=0, o=0, p=0, n=0;

        for(int i=1; i<=t; i++) {
            int x = sc.nextInt();

            if(x%2==0) 
                e++;
            else 
                o++;

            if(x>0) 
                p++;
            else if(x<0)
                n++;
        }

        System.out.println("Even: "+e);
        System.out.println("Odd: "+o);
        System.out.println("Positive: "+p);
        System.out.println("Negative: "+n);
    }
}
