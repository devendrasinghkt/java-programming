import java.util.Scanner;

public class reminder2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Dividend : ");
    double dividend = sc.nextDouble();
    System.out.println("Enter the divisor");
    double divisor = sc.nextDouble();
    double reminder= dividend%divisor;
    System.out.println(reminder);
    sc.close();

    }
}
