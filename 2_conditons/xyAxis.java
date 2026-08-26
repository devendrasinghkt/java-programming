import java.util.Scanner;

public class xyAxis {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. to check x-axis or y-axis ");
    int n = sc.nextInt();
    if(n==0){
        System.out.println("origin");
    }
    else if(n>0){
        System.out.println("x-axis");
    }
    else{
        System.out.println("y axis");
    }
    sc.close();
    }
}
