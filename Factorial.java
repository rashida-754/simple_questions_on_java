//print factorial of given number
import java.util.Scanner;
class Factorial
{
  private static int fact(int n)
  {
    return (n==1)? 1 : n*fact(n-1);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter a number:");
	n = sc.nextInt();
	System.out.println("Factorial of "+n+" is "+fact(n));
  }
}