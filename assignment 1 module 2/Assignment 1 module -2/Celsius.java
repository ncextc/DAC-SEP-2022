import java.util.Scanner;
  
public class Celsius  
 {  
   public static void main (String args[])  
    { float Fahrenheit, Celsius;  
	Scanner s = new Scanner(System.in);
	   Fahrenheit = s.nextFloat();
          Celsius  = ((Fahrenheit-32)*5)/9;  
          System.out.println("Temperature in celsius is: "+Celsius);  
    }}  