import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first value/operand : ");
    int a = sc.nextInt();
    System.out.println("Enter the operator : ");
    char op = sc.next().charAt(0);
    System.out.println("Enter the second value/operand : ");
    int b = sc.nextInt();
    switch (op) {
        case('+'):
        System.out.println(a+b);
        break;
        case('-'):
        System.out.println(a-b);
        break;
        case('*'):
        System.out.println(a*b);
        break;
        case('/'):
        System.out.println(a/b);
        break;
        default:
        System.out.println("impropriate msg");
        break;
        
    }
    sc.close();
    }
}
