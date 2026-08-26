import java.util.Scanner;
public class j03_sumOfArray {
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the Elements : ");
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();

        }
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum of array is : "+ sum);
    sc.close();
    }
}
