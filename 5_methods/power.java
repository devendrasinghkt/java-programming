import java.util.Scanner;

public class power {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a base ");
    int base = sc.nextInt();
    System.out.println("Enter a exponent value ");
    int exponent = sc.nextInt();
    // int power = 1;
    // for(int i = 1;i<=exponent;i++){
    //     power = power*base;
    // }
    // System.out.println(power);
        
    //method 2 

    System.out.println(Math.pow(base, exponent));

    sc.close();
    }
}
