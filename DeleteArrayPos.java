//Delete number at given position in array
import java.util.Scanner;
class DeleteArrayPos
{
   public static void main(String args[])
   {
     Scanner sc =new Scanner(System.in);
	 int n ,i,pos,c=0,temp;
	 System.out.println("Enter number of elements in an array");
	 n = sc.nextInt();
	 int num[] = new int[n];
	 System.out.println("Enter elements in ana array :");
	 for(i = 0 ;i<n;i++)
	   num[i] = sc.nextInt();
	 System.out.println("Enter position: ");
	 pos = sc.nextInt();
	 if(pos<1 || pos>n)
	  System.out.println("Cannot be deleted ");
	 else
	 {
	   for(i=0;i<=n;i++)
	   {
          if(i==(pos-1))
		   break;		    
	   }
	   for(c=i;i<n-1;i++)
	     num[i] = num[i+1];
	   System.out.println("After insertion : ");
	   for(i=0;i<n-1;i++)
	     System.out.println(num[i]);
	 }
   }
}