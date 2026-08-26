
import java.util.Scanner;
public class revTriAB12Rows {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows & cols of Reverse Triangle : ");
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
    //   for (int j = n-i+1; j >=1; j--) {         //my alternate
    for (int j = 1; j<=n-i+1; j++) {

        if(i%2!=0){
            System.out.print((char)(i+64)+" ");
        }
        else {
            System.out.print(i+" ");
        }
      }
      System.out.println();  
    }
    sc.close();
   } 
}
