import java.util.Scanner;

public class countDigit{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. : ");
    int n  = sc.nextInt();
    int count = 0;
    while (n!=0) {
        // int ld = n/10;
        
       if(n==0){
        System.out.println("1");
       }
       else{
        n=n/10;
        count++;
       }
    }
    System.out.println(count);
    sc.close();
    }
}