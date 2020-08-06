package lab9;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		long n,pow,p=0;
		System.out.println("enter the no. ");
		n=sc.nextInt();
		System.out.println("Enetr the power ");
		pow=sc.nextInt();
		if(pow%2==0)
		{
			for(int i=1;i<=pow/2;i++)
			{
				p=n*pow;
			}
		}
		System.out.println(p);
	}
}
