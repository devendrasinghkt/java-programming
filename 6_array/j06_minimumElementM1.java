import java.util.Scanner;

public class j06_minimumElementM1 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the Elements : ");
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print("minimum Element : "+min);
        sc.close();
    }
}
