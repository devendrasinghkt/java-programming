import java.util.Scanner;
public class highestFactor {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. to check highest factor : ");
    int n = sc.nextInt();
    int hf = 0;
    for(int i = 2;i<n/2;i++){
        if(n%i==0){
            hf = i;
        }
    }
    System.out.println(hf);
    sc.close();
    }
}
