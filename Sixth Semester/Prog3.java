package Lab6;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			
		double sum=1,f=1,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value for e(exponential) function = ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f/i;
			sum=(f+sum);
			
			
		}
		System.out.print(sum);	
			sc.close();
	}

}
