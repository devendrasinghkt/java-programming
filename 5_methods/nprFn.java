
import java.util.Scanner;
public class nprFn {
    public static int factorial(int n){
        int fact = 1;
    for(int i = 1;i<=n;i++){
        fact *=i;
    }
    return fact;

}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the n value : ");
    int n = sc.nextInt();
    System.out.print("Enter the r value : ");
    int r = sc.nextInt();
    int a = factorial(n);
    int b = factorial(n-r);
    int npr = a/b;
    System.out.println(npr);
    sc.close();
}
}
