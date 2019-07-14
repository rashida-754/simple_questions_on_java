//To print biggest and smallest number from a given set of array
import java.util.Scanner;
class FindBigSmall
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  int n,i,max,min;
	  System.out.println("Enter number of elements in an array ");
	  n = sc.nextInt();
	  int num[] = new int[n];
	  System.out.println("Enter elements in an array :");
	  for(i = 0 ;i<n;i++)
	    num[i] = sc.nextInt();
	  max = min = num[0];
	  for(i=1;i<n;i++)
	  {
	     if(num[i]>max)
		   max = num[i];
		 if(num[i]<min)
		   min = num[i];
	  }
	  System.out.println("Maximum number is : "+max);
	  System.out.println("Minimum number is : "+min);
   }
}