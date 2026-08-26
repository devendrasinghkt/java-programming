import java.util.Scanner;

public class greatestOfThem {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Ram value : ");
    int a = sc.nextInt();
    System.out.print("Enter the Shyam value : ");
    int b = sc.nextInt();
    System.out.print("Enter the Ajay value : ");
    int c = sc.nextInt();
    if(a>b &&a>c) {
        System.out.println("Ram is the gratest no : "+a);

    }
    else if (b>c && b>a){
        System.out.println("Shyam is the gratest no : "+b);

    }
    else{
        System.out.println("Ajay is the gratest no : "+c);
    }
    sc.close();
    }
}
