import java.util.Scanner;
public class tri123OddM3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows and cols of triangle");
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j<=i; j++) {
            System.out.print((2*j-1)+" ");

        }
        System.out.println();
    }
    sc.close();
    }
}
