
import java.util.Scanner;
public class swapNoWithoutExtraVariable {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the a value : ");
    int a = sc.nextInt();
    System.out.print("Enter the b value :");
    int b = sc.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println(a+" "+b);
    sc.close();       
    }
}
