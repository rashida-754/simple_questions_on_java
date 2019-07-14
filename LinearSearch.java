//To check if a number is present in array or not using Linear Search
import java.util.Scanner;
class LinearSearch
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
	 int n ,i,key,c=0;
	 System.out.println("Enter number of elements in ana array");
	 n = sc.nextInt();
	 int num[] = new int[n];
	 System.out.println("Enter elements in ana array :");
	 for(i = 0 ;i<n;i++)
	   num[i] = sc.nextInt();
	 System.out.println("Enter element to be searched : ");
	 key = sc.nextInt();
	 for(i=0;i<n;i++)
	  {
	     if(num[i] == key)
		 {
		    c =1;
			break;
		 }
	  }
	  if(c==1)
	    System.out.println(key+" is found at position "+(i+1));
	  else
	    System.out.println(key+" not found");
   }
}