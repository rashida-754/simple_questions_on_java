//Program to compare two strings
import java.util.Scanner;
class Compare2Strings
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  String s1,s2;
	  System.out.println("Enter two strings : ");
	  s1 = sc.nextLine();
	  s2 = sc.nextLine();
	  if(s1.length() > s2.length())
	    System.out.println("Length of string "+s1+" is greater than "+s2);
	  else if(s1.length() > s2.length())
	    System.out.println("Length of string "+s2+" is greater than "+s1);
	  else
	    System.out.println("Length of string "+s1+" & "+s2 +" are same");
	  if(s1.equals(s2))
	    System.out.println(s1+" & "+s2+" are same String");
	  else
	    System.out.println(s1+" & "+s2+" are not same & difference of first mis-matched character is "+ s1.compareTo(s2));
   }
}