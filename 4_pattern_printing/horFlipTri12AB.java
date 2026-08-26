import java.util.Scanner;

public class horFlipTri12AB {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows and cols of triangle : ");
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <=i; j++) { 
            if(i%2!=0){
                System.out.print(i+" ");
            }
                
            else{
                System.out.print((char)(i+64)+" ");
            }
        }
        System.out.println();
    }
    sc.close();
    }
}
