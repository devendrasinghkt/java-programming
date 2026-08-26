import java.util.Scanner;
public class j04_productOfArray {
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the Elements : ");
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int product = 1;
        for(int i = 0; i<arr.length;i++){
            product *= arr[i];
        }
        System.out.println("product of array is : "+ product);
    sc.close();
    }
}
