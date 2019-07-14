//Pallindrome of a number
import java.util.Scanner;
class Pallindrome
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  String s;
	  System.out.println("Enter a number : ");
	  s = sc.nextLine();
	  StringBuffer str = new StringBuffer(s);
	  if((str.reverse().toString()).compareTo(s)==0)
	    System.out.println(s+" Pallindrome");
	  else
	    System.out.println(s+" not a Pallindrome");
   }
}