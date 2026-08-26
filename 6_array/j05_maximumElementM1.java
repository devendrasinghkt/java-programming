import java.util.Scanner;

public class j05_maximumElementM1 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the Elements : ");
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("Maximum Element : "+max);
        sc.close();
    }
}
