import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();

        long years = a / 365;
        long months = (a%365)/30;
        long days = (a%365)%30;

        System.out.println(years+" years");
        System.out.println(months+" months");
        System.out.println(days+" days");
    }
}
