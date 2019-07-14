//read N numbers in array & display the same
import java.io.*;
class DisplayElements
{
  public static void main(String args[])throws IOException
  {
     BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter number of elements in a string:");
     int n = Integer.parseInt(obj.readLine());
	 int num[] = new int[n];
	 System.out.println("Enter elements :");
	 for(int i = 0 ; i<n;i++)
	   num[i] = Integer.parseInt(obj.readLine());
	 System.out.println("Elements in an array is :");
	 for(int i = 0; i<n ;i++)
	   System.out.println(num[i]);
  }
}