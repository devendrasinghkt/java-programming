
import java.util.Scanner;
public class revTriABRows {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows & cols of Reverse Triangle : ");
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
    //   for (int j = n-i+1; j >=1; j--) {         //my alternate
    for (int j = 1; j<=n-i+1; j++) {

         System.out.print((char)(i+64)+" ");
      }
      System.out.println();  
    }
    sc.close();
   } 
}
