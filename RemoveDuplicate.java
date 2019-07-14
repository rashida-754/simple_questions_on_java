//program to count duplicate number in array
import java.util.*;
class RemoveDuplicate
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  int n1,i;
	  System.out.println("Enter number of elements in an array :");
	  n1 = sc.nextInt();
	  System.out.println("Enter elements in an array :");
	  int num[] = new int[n1];
	  for(i=0;i<n1;i++)
	    num[i] = sc.nextInt();
	  HashSet<Integer> h = new HashSet<>();
	  for(int n : num)
	  {
	     h.add(n);
	  }
	  System.out.println("After removing duplicated element : ");
	  for(int s : h)
		  System.out.println(s);
   }
}