//To check if given string is pallindrome or not
import java.util.Scanner;
class PallindromeString
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
	 String s;
	 System.out.println("Enter a string ");
	 s = sc.nextLine();
	 StringBuffer b = new StringBuffer(s);
	 if(b.reverse().toString().equalsIgnoreCase(s))
	   System.out.println(s+" IS PALLINDROME");
	 else
	   System.out.println(s+" IS NOT PALLINDROME");
   }
}