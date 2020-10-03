import java.util.Scanner;
public class MaximumOfThree {
	public static void main(String[] args)
	{
		int a =10;
		int b=5;
		char operator='*';
		if(operator=='+')
		{
		System.out.println("Sum "+ (a+b));
		}
		else if(operator=='-')
		{
		System.out.println("Difference "+(a-b));
		}
		else if(operator=='*')
		{
		System.out.println("Multiplication "+(a*b));
		}
		else if(operator=='/')
		{
		System.out.println("Division "+(a/b));
		}
	}
}
