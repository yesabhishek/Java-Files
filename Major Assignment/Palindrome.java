/* Name :ABHISHEK CHOUDHURY
Branch : CSIT 'A'
Reg no : 1641017076
*/
package majorass;
import java.util.*;
public class Palindrome
{
	Palindrome()
	{
		System.out.println("Created a Palindrome Object");
	}

	public boolean checkPalindrome(int y)
	{
		int orig=y;
		int drev=0;
		SimpleCalculator ob=new SimpleCalculator();
		while(y>0)
		{
			drev=ob.multiplicationSimple(drev,10)+ob.remainderSimple(10,y);
			y=ob.divisionSimple(y,10);
			
		}
		if(drev==orig)
		     return true;
		else
			return false;
		
	}


	
	public static void main(String[] args)
	{
		Palindrome obj=new Palindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Is "+n+" a palindrome number? ");
		System.out.println(obj.checkPalindrome(n));
		
		

	}

}
