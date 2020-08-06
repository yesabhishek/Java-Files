/* Name :ABHISHEK CHOUDHURY
Branch : CSIT 'A'
Reg no : 1641017076
*/
package majorass;
import java.util.*;
public class FibonacciNumber
{

	FibonacciNumber() 
	{
		System.out.println("Created a FibonacciNumber Object");
	}

public void printFibonacciNumbers(int n)
       {
	     int a=1,b=1,c,i=1;
	     SimpleCalculator object=new SimpleCalculator();
	     if(n==1)
				System.out.print(a);
			else if(n==2)
				System.out.print(a+" "+b+" ");
			else
				System.out.print(a+" "+b+" ");
	     while(i<=n-2)
			{
				
	    	    c=object.additionSimple(a, b);
				System.out.print(c+" "); 
				a=b;
				b=c;
				i++;
			}
	            
		
	   }

	public static void main(String[] args)
	{
		FibonacciNumber obj=new FibonacciNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which fibonnaci number is to be generated :");
		int m=sc.nextInt();
		obj.printFibonacciNumbers(m);

	}

}
