import java.util.Scanner;

public class j01_inputAndPrint {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of an array ");
    int n = sc .nextInt();

    int arr[] = new int [n];
    System.out.print("Enter the elements : ");
    for(int i = 0 ;i<n;i++){
        arr[i] = sc.nextInt();
    }

    System.out.print("Your element is ");
    for(int i = 0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();
    }
}
