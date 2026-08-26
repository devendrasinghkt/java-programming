import java.util.Scanner;

public class tri123OddM2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows and cols of triangle");
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i*2-1; j+=2) {
            System.out.print(j+" ");

        }
        System.out.println();
    }
    sc.close();
    }
}
