//Print table from 1 to 10
class Table10
{
   public static void main(String args[])
   {
      int j,i;
	  for(i=1;i<=10;i++)
	  {
	    System.out.println("Table of "+i);
		for(j=1;j<=10;j++)
	    System.out.println(i+" * "+j+" = "+j*i);
	  }
   }
}