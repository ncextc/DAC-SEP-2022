import java.util.*;

public class circle{
 
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the radius");
	  double radius = sc.nextFloat();
	

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference is = " + circumference);
        System.out.println("Area is = " + area);
    }
}