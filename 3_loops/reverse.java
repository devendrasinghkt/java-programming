import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. ");
    int n = sc.nextInt();
    int rev = 0;
    while (n!=0) {
        int ld =n%10;
        rev = rev*10;
        rev = ld+rev;
        n=n/10;
    }
    System.out.println(rev);
    sc.close();
    }
}
