import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the cp : ");
    int cp = sc.nextInt();
    System.out.print("Enter the sp : ");
    int sp = sc.nextInt();
    if(cp == sp ){
        System.out.println("Both are equal "+sp+" rupees.");
        }
    else if(cp>sp) {
        System.out.println("loss " + (sp-cp) + " rupees.");
    }
    else {
        System.out.println("profit "+(sp-cp) + " rupees.");
    }
    sc.close();
    } 
}
