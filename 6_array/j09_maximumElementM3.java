import java.util.Scanner;

public class j09_maximumElementM3 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the Elements : ");
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
           max = Math.max(arr[i] , max);
        }
        System.out.print("maximum Element : "+max);
        sc.close();
    }
}
