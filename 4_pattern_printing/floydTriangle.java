import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows and cols of triangle");
    int n = sc.nextInt();
    int floyd = 1;
    for(int i = 1; i<=n; i++){
        for (int j = 1; j <=i; j++) {
            System.out.print(floyd+" ");
            floyd++;
        }
        System.out.println();
    }
    sc.close();
}
}