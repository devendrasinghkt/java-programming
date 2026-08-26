import java.util.Scanner;

public class j10_minimumElementM3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size]; 
        System.out.print("Enter the Elements : ");
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
           min = Math.min(arr[i] , min);
        }
        System.out.print("minimum Element : "+min);
        sc.close();
    }
}
