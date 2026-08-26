import java.util.Scanner;
public class greatestOfThemNested {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter the A value : ");
    int a = sc.nextInt();
    System.out.print("Enter the B value : ");
    int b = sc.nextInt();
    System.out.print("Enter the C value : ");
    int c = sc.nextInt();
    if(a>b) {
        if(a>c) {
            System.out.println("A is the greatest ");
        }
        else {
            System.out.println("C is the greatest");
        }

    }
    else {
        if(b>c) {
            System.out.println("B is the greatest");
        }
        else {
            System.out.println("C is the greatest");
        }
    
    }
    
    sc.close();
    }
}

