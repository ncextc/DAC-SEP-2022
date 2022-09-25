class P12{

public static void main(String args[]){
      for (int i=1;i<=5;i++) //row
{     
      for (int s=5;s>i;s--) //spaces
	  {
	  System.out.print(" ");
	  }
	 
	 for(int j=1;j<=i;j++) //column
{
	 System.out.print(i+" ");
	  }
	  System.out.println();
}
}
}