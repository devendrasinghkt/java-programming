import java.util.Scanner;
public class reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend :- ");
        double dividend = sc.nextDouble();
        System.out.println("Enter the divisor :-");
        double divisor = sc.nextDouble();
        double quotient = dividend/divisor;
        double reminder = dividend-(divisor*quotient);
        System.out.println("reminder"+reminder);
        sc.close();
        sc.nextInt();
    }
}
