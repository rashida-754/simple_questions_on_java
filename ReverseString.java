//program to print string in reverse order
import java.util.Scanner;
class ReverseString
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  String s;
	  System.out.println("Enter a string : ");
	  s = sc.nextLine();
	  char[] r = s.toCharArray();
	  for(int i =0 ;i<r.length/2;i++)
	  {
		   char c = r[i];
	       r[i] = r[r.length-i-1];
		   r[r.length-i-1] = c;
	  }
	  String t = new String(r);
	  System.out.println("Reversed string is : "+t);
   }
}