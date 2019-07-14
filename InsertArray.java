//Insert number at given position in array
import java.util.Scanner;
class InsertArray
{
   public static void main(String args[])
   {
     Scanner sc =new Scanner(System.in);
	 int n ,i,ele,pos,c=0,temp;
	 System.out.println("Enter number of elements in an array");
	 n = sc.nextInt();
	 int num[] = new int[n];
	 int nu[] = new int[n+1];
	 System.out.println("Enter elements in ana array :");
	 for(i = 0 ;i<n;i++)
	   num[i] = sc.nextInt();
	 System.out.println("Enter element to be inserted & position: ");
	 ele = sc.nextInt();
	 pos = sc.nextInt();
	 if(pos<1 || pos>n)
	  System.out.println("Cannot be insrted ");
	 else
	 {
	   for(i=0;i<=n;i++)
	   {
          if(i<(pos-1))
		   nu[c++] = num[i];
          else if(i==(pos-1))
            nu[c++] = ele;
         else 
          nu[c++] = num[i-1];		    
	   }
	   System.out.println("After insertion : ");
	   for(i=0;i<=n;i++)
	     System.out.println(nu[i]);
	 }
   }
}