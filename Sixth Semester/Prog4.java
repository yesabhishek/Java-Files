package Lab6;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sum=0,p,f=1,n,sign=-1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value for cosine function = ");
		n=sc.nextInt();
		p=1;
		for(int i=2;i<=n;i=i+2)
		{
			f=f*(i-1)*i;
			p=p*n*n;
			sum=sum+(p/f)*sign;
			sign=-sign;
		}
			System.out.println(sum);
			sc.close();
	}

}
