/* Name :ABHISHEK CHOUDHURY
Branch : CSIT 'A'
Reg no : 1641017076
*/
package majorass;
import java.util.*;

public class ExtendedCalculator 
{

	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("1: for Square");
		System.out.println("2: to check for Prime Number");
		System.out.println("3: to print Fibonacci Numbers");
		System.out.println("4: to Calculate the Euclidean Distance between Points");
		System.out.println("5: to Check for Palindrome");
		System.out.println("Enter your operation number (1-5)");
		short input = scanner.nextShort();
		if (input == 1)
		{
			System.out.println("Enter a Number");
			int n = scanner.nextInt();
			CalculateSquare squareObject = new CalculateSquare();
			int squareValue = squareObject.calculateSquare(n);
			System.out.println("The Number Squared is "+squareValue);
		}
		else if (input == 2)
		{
			
			System.out.println("Enter a Number");
			int n = scanner.nextInt();
			PrimeNumber prime=new PrimeNumber();
			prime.checkPrimeNumber(n);
			
			
		}
			
		else if (input == 3)
		{
			System.out.println("Enter a Number upto which fibonnaci numbers are to be generated :");
			int n = scanner.nextInt();
			FibonacciNumber fib=new FibonacciNumber();
			fib.printFibonacciNumbers(n);
		}
		else if (input == 4)
		{
			int x1, y1, x2, y2;
			System.out.println("Enter 2 co-ordinates of which you want to find distance:");
			System.out.println("Enter x and y co-ordinates of the first point");
			x1=scanner.nextInt();
			y1=scanner.nextInt();
			System.out.println("Enter x and y co-ordinates of the second point");
			x2=scanner.nextInt();
			y2=scanner.nextInt();
			EuclideanDistance ed=new EuclideanDistance();
			System.out.println("Distance between the points is "+ed.calculateEuclideanDistance(x1,y1,x2,y2));
		}
		else if (input == 5)
		{
			
			System.out.println("Enter a number:");
			int n=scanner.nextInt();
			Palindrome pd=new Palindrome();
			System.out.println("Is "+n+" a palindrome number? ");
			System.out.println(pd.checkPalindrome(n));
		}
		else
		{
			System.out.println("Wrong Output");
		}
		scanner.close(); 
	}


		


	}


