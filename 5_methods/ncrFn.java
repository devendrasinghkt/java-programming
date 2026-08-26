
import java.util.Scanner;
public class ncrFn {
    public static int fact(int n){
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
    int a = fact(n);
    int b = fact(r);
    int c = fact(n-r);
    int ncr = a/(b*c);
    System.out.println(ncr);
    sc.close();
}
}
