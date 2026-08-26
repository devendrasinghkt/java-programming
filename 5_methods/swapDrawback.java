import java.util.Scanner;
public class swapDrawback {
    public static void swap(int x, int y) {
        int temp = x;
        x =y;
        y = temp;
       
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the a value : ");
    int a = sc.nextInt();
    System.out.print("Enter the b value :");
    int b = sc.nextInt();
    System.out.println(a+" "+b);
    swap(a,b);
    sc.close();
    }
    
}
