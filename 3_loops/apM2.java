import java.util.Scanner;
public class apM2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. to find nth term of Ap : ");
    int n = sc.nextInt();
    int nthTerm = 1;
    for(int i = 1;i<=n;i++){
        System.out.println(nthTerm);
        nthTerm+=2;
    }
    sc.close();
    }
}
