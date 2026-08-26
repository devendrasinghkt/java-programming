import java.util.Scanner;
public class areaPerimeter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int b = sc.nextInt();
        int perimeter = 2 * (l + b);
        int area = l * b;
        System.out.println("perimeter of rectangle : " + perimeter);
        System.out.println("Area of rectangle : " + area);
        if (area > perimeter) {
            System.out.println("Area is greater than perimter. ");
            } 
        else if(area == perimeter){
            System.out.println("both are equall ");
        }
        else {
            System.out.println("Perimeter is greater then area. ");
            }
    sc.close();
    }
}
