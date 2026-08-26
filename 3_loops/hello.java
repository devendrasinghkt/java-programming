import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no how many times print Hello programmers.");
    int n = sc.nextInt();
    for(int i =1;i<=n;i++){
        System.out.println("Hello programmers");
    }
    sc.close();
    }
}
