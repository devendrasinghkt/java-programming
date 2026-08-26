import java.util.Scanner;
public class divisibleBy3And5Nested {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. to check it is divisible by 3 and 5 or not : ");
    int n = sc.nextInt();
    if(n%3==0){
        if(n%5==0) {
            System.out.println("It is divisible by 3 and 5 ");
        }
        else{
            System.out.println("It is not divisible 3 and 5");
        }
    }
    else {
        System.out.println("It is not divisible 3 and 5");
    }
    sc.close();
    }
}


