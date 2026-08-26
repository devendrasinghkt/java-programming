import java.util.Scanner;
public class volOfSphere{
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the radius : " );
    double radius = sc.nextDouble();
    double otherCalculation = (4.0/3);
    double vol = otherCalculation*Math.PI*radius*radius*radius;
    System.out.println(vol); 
    sc.close(); 
    }
}