import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first subject number out of 100 :- ");
    double a = sc.nextDouble();
    System.out.print("Enter the Second subject number out of 100 :- ");
    double b = sc.nextDouble();
    System.out.print("Enter the Third subject number out of 100 :- ");
    double c = sc.nextDouble();
    System.out.print("Enter the Fourth subject number out of 100 :- ");
    double d = sc.nextDouble();
    System.out.print("Enter the fifth subject number out of 100 :- ");
    double e = sc.nextDouble();
    double percentage = (((a+b+c+d+e)*100)/500);
    System.out.println("percentage of student "+ percentage);
    sc.close();

    }
}
