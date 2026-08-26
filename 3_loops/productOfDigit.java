import java.util.Scanner;

public class productOfDigit {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. : ");
    int n = sc.nextInt();
    int product = 1;
    while (n!=0) {
        int ld = n%10;
        product*=ld;
        n/=10;
        
    }
    System.out.println(product);
    sc.close();
   } 
}

