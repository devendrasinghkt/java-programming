import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of rows and cols of the plus diagram : ");
    int n = sc.nextInt();
    int mid = (n+1)/2;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n; j++) {
            if ((mid==i || mid==j)) {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
            
        }
        System.out.println();
    }
    sc.close();
    }
}
