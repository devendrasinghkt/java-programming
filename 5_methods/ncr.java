import java.util.Scanner;
public class ncr {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the n value : ");
    int n = sc.nextInt();
    System.out.print("Enter the r value : ");
    int r = sc.nextInt();
    int a =1 ,b=1,c=1;
    for(int i = 1; i<= n;i++){
        a=a*i;
    }
    for(int i = 1; i<= r;i++){
        b=b*i;
    }
    for(int i = 1; i<= n-r;i++){
        c=c*i;
    }
    int ncr = a/(b*c);
    System.out.println(ncr);
    sc.close();
}
}
