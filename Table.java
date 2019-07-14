//Print table of a given number
import java.util.Scanner;
class Table
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int n,i;
	  System.out.println("Enter number : ");
	  n = sc.nextInt();
	  for(i=1;i<10;i++)
	    System.out.println(n+" * "+i+" = "+i*n);
   }
}