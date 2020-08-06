package Lab6;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum,p,f=1,n,sign=-1;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value for sine function = ");
		n=sc.nextInt();
		sum=n;p=n;
		for(int i=3;i<=n;i=i+2)
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


