import java.util.Scanner;

public class divisibleBy3Or5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. to check divisible by 3 or 5 or not : ");
    int n = sc.nextInt();
    if(n%3==0 || n%5==0) {
        System.out.println("It is divisible by 3 or 5 ");

    }
    else {
        System.out.println("It is not divisible by 3 or 5 ");

    }
    sc.close();
    }
}
