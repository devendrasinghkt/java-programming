import java.util.Scanner;

public class j02_FindNegativeElement {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        
        
        int[] arr = new int[n];
        System.out.print("Enter the Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        int[] arr2 = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0 ){
                arr2[count] = arr[i];
                count++;
            }
        }

        for (int i = 0; i <count; i++) {
            System.out.println(arr2[i]);
        }
        sc.close();
    }
}
