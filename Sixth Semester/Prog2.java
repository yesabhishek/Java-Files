package Lab6;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			int sum=0,f=1,n;
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the n value for factorial series = ");
			n=sc.nextInt();
			for(int i=1;i<=n;i++)
		{
			f=f*i;
			sum=(f+sum);
		}
			System.out.println(sum);
			sc.close();
	}

}
