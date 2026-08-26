import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no. :");
        double  a = sc.nextDouble();
        System.out.print("Enter the second no. :");
        double  b = sc.nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        sc.close();
        


    }
}
