import java.util.Scanner;

public class divisibleBy5not3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no to check divisible by 5 not 3 : ");
    int n = sc.nextInt();
    if(n%5==0 && n%3!=0){
        System.out.println("Divisible by 5 not 3 ");
    }
    else{
        System.out.println("It is not divisible by 5 not 3 ");
    }
    sc.close();
    }
}
