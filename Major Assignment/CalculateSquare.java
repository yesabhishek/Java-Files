/* Name :ABHISHEK CHOUDHURY

Branch : CSIT 'A'
Reg no : 1641017076
*/
package majorass;
import java.util.*;
public class CalculateSquare
{
	CalculateSquare()
	{
		System.out.println("Created a Calculate Square Object");

	}
	public int calculateSquare(int y)
	{
		
		SimpleCalculator object=new SimpleCalculator();
		int square=object.multiplicationSimple(y, y); 
		return square;
		
	}

	public static void main(String[] args)
	{
		CalculateSquare obj=new CalculateSquare();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Square of the number is :"+obj.calculateSquare(n));

	}

}
