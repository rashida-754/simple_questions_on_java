//print prime numbers between 2 to 100
class Prime100
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  int i,j,c;
	  System.out.println("Prime numbers between 2 to 100");
	  for(i=2;i<=100;i++)
	  {
	     c=0;
	     for(j=2;j<i/2;j++)
		 {
		    if(i%j==0)
			{
			   c++;
			   break;
			}
		 }
		 if(c==0)
		   System.out.println(i);
	  }
   }
}