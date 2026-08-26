import java.util.Scanner;
public class factorialNSeries {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no to find factorial : ");
    int n = sc.nextInt();
    int factorial = 1;
    for (int i = 1; i <=n; i++) {
        
        factorial*=i;
        System.out.println("factorial of "+i+"="+factorial);

    }
    
sc.close();
}
    
}

