//STAR PATTERN 11
class ST11{

public static void main(String args[]){
      for (int i=0;i<=4;i++) //row
{     
      for (int s=3;s<3;s++) //spaces
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