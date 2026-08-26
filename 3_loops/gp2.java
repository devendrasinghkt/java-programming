import java.util.Scanner;

public class gp2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. to find nth term of gp : ");
    int n = sc.nextInt();
    int nthTerm = 3;
    for(int i = 1;i<=n;i++){
        System.out.println(nthTerm);
        nthTerm*=4;
    }
    sc.close();
    }
}
