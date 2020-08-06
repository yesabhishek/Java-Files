package lab5;

import java.util.Scanner;

public class Prog14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1; float k=1;;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. = ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
			
		}
	
		
		System.out.println("the factorial of "+n+ " is "+fact);
	}

}
