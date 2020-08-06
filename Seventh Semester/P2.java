package Lab8;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// TODO Auto-generated method stub
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		int i,pro=1;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			pro*=a[i];
		}
		double g1,g2;
		double error=0.25;
		g2=pro/n;
		do{
			g1=g2;
			g2=((n-1)*g1+(pro/Math.pow(g1,n-1)))/n;
			
		}while(Math.abs(g1-g2)>error);
		System.out.println("the geometric mean is "+g2);
		sc.close();
	}

}
