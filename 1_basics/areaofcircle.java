import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of circle :-");
    double r = sc.nextDouble();
    double radius = 3.141592*r*r;
    System.out.println("radius of circle :- "+radius);
    sc.close();


    }
}
