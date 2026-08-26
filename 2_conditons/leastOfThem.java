import java.util.Scanner;
public class leastOfThem {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the A value : ");
    int a = sc.nextInt();
    System.out.print("Enter the B value : ");
    int b = sc.nextInt();
    System.out.print("Enter the C value : ");
    int c = sc.nextInt();
    if(a<b &&a<c) {
        System.out.println("A is the least "+a);

    }
    else if (b<c && b<a){
        System.out.println("B is the least "+b);

    }
    else{
        System.out.println("C is the least "+c);
    }
    sc.close();
    }
}


