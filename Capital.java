//program to print first character of each word in capital letter of given string
import java.util.Scanner;
class Capital
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
	 String s;
	 System.out.println("Enter a string : ");
	 s = sc.nextLine();
	 String t[] = s.split("\\s");
	 for(int i = 0; i<t.length;i++)
	   System.out.println("First character of word "+t[i]+" in capital is "+Character.toUpperCase(t[i].charAt(0)));
   }
}