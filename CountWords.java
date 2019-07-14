//To find number of words in given string
import java.util.Scanner;
class CountWords
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
	 String s;
	 System.out.println("Enter a string :");
	 s = sc.nextLine();
	 String[] c = s.split("\\s");
	 System.out.println("Number of words in a string is : "+c.length);
   }
}