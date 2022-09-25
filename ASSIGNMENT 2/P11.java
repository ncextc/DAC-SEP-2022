class P11{

public static void main(String args[]){
      for (int i=1;i<=5;i++) //row
{     
      for (int s=0;s<(5-i);s++) //spaces
	  {
	  System.out.print(" ");
	  }
	 
	 for(int j=0;j<(2*i-1);j++) //column
{
	 System.out.print("*");
	  }
	  System.out.println();
}
}
}