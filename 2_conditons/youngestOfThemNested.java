import java.util.Scanner;
public class youngestOfThemNested {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Ram value : ");
    int a = sc.nextInt();
    System.out.print("Enter the Shyam value : ");
    int b = sc.nextInt();
    System.out.print("Enter the Ajay value : ");
    int c = sc.nextInt();
    if(a<b) {
        if(a<c) {
            System.out.println("Ram is the youngest "+a);
        }
        else {
            System.out.println("Ajay is the youngest "+c);
        }

    }
    else {
        if(b<c) {
            System.out.println("Shyam is the youngest "+b);
        }
        else {
            System.out.println("Ajay is the youngest "+c);
        }
    
    }
    
    sc.close();
    }
}

