import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the principal value : ");
    double  principal = sc.nextDouble();
    System.out.println("Enter the Rate : ");
    double rate = sc.nextDouble();
    System.out.println("Enter the time : ");
    double time = sc.nextInt();
    // double si = (principal*rate*time)/100;  // for use years
    double si = (principal*rate*time/12)/100; // for use months
    System.out.println("simple interest is : " + si);
    sc.close();
    }
}
