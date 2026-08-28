import java.util.Scanner;

public class j11_countnoAndFindGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array Elements : ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the second element to count the no. of elements in given array greater than second element : ");
        int m = sc.nextInt();
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>m){
                count++;
            }

        }
        System.out.println(count);

        sc.close();
    }
}
