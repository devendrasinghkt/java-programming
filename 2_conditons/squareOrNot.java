import java.util.Scanner;
public class squareOrNot {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the length of the rectangle : to check its square or not :- ");
    int l = sc.nextInt();
    System.out.print("Enter the breadth of the rectangle : to check its square or not :- ");
    int b = sc.nextInt();
    if(l==b){
        System.out.println("It is a square ");
    }
    else{
        System.out.println("It is not a square ");
    }
    sc.close();
    }
}
