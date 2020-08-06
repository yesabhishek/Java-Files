/* Name :ABHISHEK CHOUDHURY
Branch : CSIT 'A'
Reg no : 1641017076
*/
package majorass;
import java.util.*;
public class PrimeNumber
{

	PrimeNumber() 
	{
		
		System.out.println("Created a PrimeNumber Object");
	}

public boolean checkPrimeNumber(int y)

    {
	 
	

	  SimpleCalculator object=new SimpleCalculator();
	  int i, res;
		boolean flag=true;
		for(i=2;i<=y/2;i++)
		{
			res=object.remainderSimple(i, y);
			if(res==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(y + " is a Prime Number");
			return true;
		}	
		else
			System.out.println(y + " is not Prime Number");
		    return false;
	}


	
	public static void main(String[] args) 
	{
		PrimeNumber ob=new PrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		ob.checkPrimeNumber(n);
		

	}

}
