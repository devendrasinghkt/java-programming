import java.util.Scanner;
public class threeDigitNoOrNot {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. to check it is three digit no. or not : ");
    int n = sc.nextInt();
    if(n>99 && n<1000) {
        System.out.println("It is three digit no. ");
    }
    else {
        System.out.println("It is not three digit no. ");
    }
    sc.close();
    }
}
