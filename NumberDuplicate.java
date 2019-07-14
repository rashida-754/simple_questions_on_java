//program to count duplicate number in array
import java.util.*;
class NumberDuplicate
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
	  HashMap<Integer,Integer> map = new HashMap<>();
	  for(int n : num)
	  {
	     if(map.containsKey(n))
		 {
		    int val = map.get(n);
			map.put(n,val+1);
		 }
		 else
		   map.put(n,1);
	  }
	  System.out.println("Number of duplicate numbers : "+(n1-map.size()));
   }
}