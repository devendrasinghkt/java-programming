import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter x cordinate : ");
    int x = sc.nextInt();
    System.out.print("Enter y cordinate : ");
    int y = sc.nextInt();
    if(x == 0 && y==0){
        System.out.println("origin");
    }
    else if(x>0 && y>=0) {
        System.out.println("1st quadrant +,+");
    }
    else if(x<0 && y>=0) {
        System.out.println("2nd quadrant -,+");
    }
    else if(x<0 && y<=0) {
        System.out.println("3rd quadrant -,-");
    }
    else{
        System.out.println("4th quadrant +,-");
    }
    
    sc.close();
    }
}
