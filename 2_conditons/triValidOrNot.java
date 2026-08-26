import java.util.Scanner;
public class triValidOrNot {
    public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Enter the A side of triangle : ");
    int a = sc.nextInt();
    System.out.print("Enter the B side of the triangle : ");
    int b = sc.nextInt();
    System.out.print("Enter the C side of the triangle : ");
    int c = sc.nextInt();
    if((a+b>c)&&(b+c>a)&&(c+a>b)){
       System.out.println("Triangle is valid "); 
    }
    else {
        System.out.println("Triangle is not valid ");
    }   
    sc.close();
    }
}
