import java.util.Scanner;

public class intToChar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no that you want typecasting");  
    int no = sc.nextInt();
    char y = (char)no;
    System.out.println("typecasting : " + y);
    sc.close();
    
    }
}
