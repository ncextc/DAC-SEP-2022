class P13{

public static void main(String args[]){
      for (char i='A';i<='E';i++) //row
{     
      for (char s='A';s>i;s--) //spaces
	  {
	  System.out.print(" ");
	  }
	 
	 for(char j='A';j<=i;j++) //column
{
	 System.out.print(i+" ");
	  }
	  System.out.println();
}
}
}