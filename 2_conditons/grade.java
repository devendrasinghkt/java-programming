import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the percentage of student : ");
    int percentage = sc.nextInt();
    if(percentage >80 && percentage<101){
        System.out.println("Grade A ");
    }
    else if(percentage>60) {
        System.out.println("Grade B ");
    }
    else if(percentage>40){
        System.out.println("Grade C");
    }
    else if(percentage<=40 && percentage >=0){
        System.out.println("Grade D");
    }
    else
    {
        System.out.println("impropriate msg or percentage. ");
    }
    sc.close();
    }
}
