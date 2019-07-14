//Delete number from array
import java.util.Scanner;
class DeleteArray
{
   public static void main(String args[])
   {
     Scanner sc =new Scanner(System.in);
	 int n ,i,ele,c;
	 System.out.println("Enter number of elements in an array");
	 n = sc.nextInt();
	 int num[] = new int[n];
	 System.out.println("Enter elements in ana array :");
	 for(i = 0 ;i<n;i++)
	   num[i] = sc.nextInt();
	 System.out.println("Enter element to be deleted: ");
	 ele = sc.nextInt();
	   for(i=0;i<n;i++)
	   {
          if(num[i]==ele)
		  {
			  c = i;
			  break;
		  }	    
	   }
	   for(c=i; i<n-1;i++)
		   num[i] = num[i+1];
	   System.out.println("After deletion : ");
	   for(i=0;i<n-1;i++)
	     System.out.println(num[i]);
   }
}