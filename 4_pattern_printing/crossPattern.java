import java.util.Scanner;

public class crossPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of rows and cols of cross Pattern : ");
    int n = sc.nextInt();
    if (n%2==0) {
        System.out.print("Please enter odd no. ");
    }
    else {
         for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n; j++) {
            if((i==j) || (i+j == n+1)){
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
    sc.close();
    }
}
