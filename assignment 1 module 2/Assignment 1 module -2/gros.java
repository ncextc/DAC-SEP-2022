import java.util.Scanner;
public class gros

{
    public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Emplooyee's Basic salary:");

	double DA;
	double HRA;
	double GS;
	
        int Basic = sc.nextInt();
			
		if(Basic<10000)
		{	
		DA = (90 / 100.0 )* Basic;
        HRA = 10 / 100.0 * Basic;
        GS = Basic + DA + HRA;
		System.out.println("Gross Salary = " +GS );}
	
			else if(Basic>=10000)
			{		
       	
		DA = (98 / 100.0 )* Basic;
        HRA = 2000;
        GS = Basic + DA + HRA;
			System.out.println("Gross Salary = " +GS );}}
			
      
}
