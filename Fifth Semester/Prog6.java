package lab5;

import java.util.Scanner;

public class Prog6 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=0,p=0,n_=0,no=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of nubers you want to insert ");
		n=sc.nextInt();
	
for(int i=0;i<n;i++)
{
	System.out.println("enter the nos =");
	 no=sc.nextInt();
	

if (no>0)
	p++;
else
	n_++;}
System.out.println("the no of +ve integer are "+p);
System.out.println("the no of -ve integer are "+n_);

}
}
