class ST4{

public static void main(String args[]){
      for (int i=0;i<=4;i++) //row
{     
      for (int s=4;s<=0;s--)
	  {
	  System.out.print(" ");
	  }
	 
	 for(int j=1;j<=i+1;j++) //column
{
	 System.out.print("* ");
	  }
	  System.out.println();
}
}
}