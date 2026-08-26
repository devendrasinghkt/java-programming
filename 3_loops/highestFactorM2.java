import java.util.Scanner;
public class highestFactorM2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. to check highest factor : ");
    int n = sc.nextInt();
    for(int i = n/2;i>=2;i--){
        if(n%i==0){
          System.out.println(i); 
          break; 
        }
    }
    sc.close();
    }
}