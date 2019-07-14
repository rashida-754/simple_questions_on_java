//Search a number using Binary Search
import java.util.Scanner;
import java.util.Collections;
import java.util.*;
import java.util.stream.*;
class BinarySearch
{
    public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  int n ,i,key,c=0;
	  System.out.println("Enter number of elements in ana array");
	  n = sc.nextInt();
	  int num[] = new int[n];
	  ArrayList<Integer> l = new ArrayList<>();
	  System.out.println("Enter elements in ana array :");
	  for(i = 0 ;i<n;i++)
	  {
	    num[i] = sc.nextInt();
	    l.add(num[i]);
	  }
	  Collections.sort(l);
	  for(i=0;i<n;i++)
		  num[i] =l.get(i);
	  System.out.println(l);
	  System.out.println("Enter element to be searched : ");
	  key = sc.nextInt();
	  int start=0 ,end=n-1 ,mid = (start+end)/2;
	  while(start<=end)
	  {
		 if(num[mid]<key)
		  start = mid+1;
	     else if(num[mid] == key)
		  {
		     c=1;
		     break;
		  }
		 
		 else 
			 end = mid-1;
	     mid = (start+end)/2;
		 
	  }
	  if(c==1)
	  System.out.println(key+" found at position "+(mid+1));
	  else
	  System.out.println(key+" not found ");
	}
}