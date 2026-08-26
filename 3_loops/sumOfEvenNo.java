import java.util.Scanner;

public class sumOfEvenNo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    int even = 0;
    while (n!=0) {
        int ld = n%10;
        if(ld%2==0){
            even+=ld;
        }
        n/=10;
    }
    System.out.println(even);
    sc.close();
    }
}
