
import java.util.Scanner;
public class triABRows {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows & cols of Triangle : ");
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
      for (int j = 1; j <=i; j++) {

         System.out.print((char)(i+64)+" ");
      }
      System.out.println();  
    }
    sc.close();
   } 
}
