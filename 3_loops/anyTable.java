import java.util.Scanner;
public class anyTable {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table no. : ");
        int n = sc.nextInt();
        for(int i = n;i<=n*10;i=i+n){
            System.out.println(i);
        }
        sc.close();
    }
}
