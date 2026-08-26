import java.util.Scanner;

public class primeOrComposite {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. to check  prime or composite no. ");
    int n = sc.nextInt();
    boolean flag = true;
    for(int i=2;i<n;i++){
        if(n%i==0){
            flag = false;
            break;
        }
        
    }
    if(n==1){
        System.out.println("Universal No.");
    }
    else if(flag) {
        System.out.println("Prime No.");
    }
    else if(!flag){
        System.out.println("Composite No.");
    }
    else {
        System.out.println("Impropriate msg ");
    }
    sc.close();
    }
}
