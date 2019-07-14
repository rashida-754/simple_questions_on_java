//pogram to print number of occurrence of each character in given string
import java.util.Scanner;
import java.util.HashMap;
class Occurrence
{
   public static void main(String args[])
   {
      Scanner sc =new Scanner(System.in);
	  String s;
	  System.out.println("Enter a string:");
	  s = sc.nextLine();
	  HashMap<Character,Integer> map = new HashMap<>();
	  char t[] = s.toCharArray();
	  for(char c : t)
	  {
	     if(map.containsKey(c))
		 {
		   int val = map.get(c);
		   map.put(c,val+1);
		 }
		 else
		   map.put(c,1);
	  }
	  for(HashMap.Entry<Character,Integer> e : map.entrySet())
	  System.out.println(e.getKey()+" = "+e.getValue());
   }
}