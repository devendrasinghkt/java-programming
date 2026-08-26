import java.util.Scanner;

public class StraightLineOrNot {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the x1 value");
    int x1 = sc.nextInt();
    System.out.println("Enter the y1 value");
    int y1 = sc.nextInt();
    System.out.println("Enter the x2 value");
    int x2 = sc.nextInt();
    System.out.println("Enter the y2 value");
    int y2 = sc.nextInt();
    System.out.println("Enter the x3 value");
    int x3 = sc.nextInt();
    System.out.println("Enter the y3 value");
    int y3 = sc.nextInt();
    if(((y2-y1)/(x2-x1)) ==( (y3-y2)/(x3-x2))){
        System.out.println("It a straight line ");
    }
    else {
        System.out.println("It is not a straight line");
    }
    sc.close();
    }
}
