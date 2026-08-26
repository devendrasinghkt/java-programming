import java.util.Scanner;
public class swapOf2No {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the a value : ");
    int a = sc.nextInt();
    System.out.print("Enter the b value :");
    int b = sc.nextInt();
      int temp = a;
      a = b;
      b = temp;
      System.out.println(a+" "+b);
    sc.close();       
    }
}
