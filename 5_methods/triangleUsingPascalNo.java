
import java.util.Scanner;
public class triangleUsingPascalNo {
    public static int ncr(int n ){
       int fact = 1;
       for (int i = 1; i <=n; i++) {
            fact*=i;
       }
       return fact;
   
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows and cols of the triangle");
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print(ncr(i)/(ncr(j)*ncr(i-j))+"   ");
        }
        System.out.println();
    }
    sc.close();
    }
}
