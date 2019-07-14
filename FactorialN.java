//print factorial of numbers in given range
import java.util.Scanner;
class FactorialN
{
  private static long fact(long n)
  {
    return (n==1||n==0)? 1 : n*fact(n-1);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	int start,end,i;
	System.out.println("Enter Start & end point");
	start= sc.nextInt();
	end= sc.nextInt();
	for(i=start;i<=end;i++)
	System.out.println("Factorial of "+i+" is "+fact(i));
  }
}