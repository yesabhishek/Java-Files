package lab5;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,no=0,sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of nubers you want to insert ");
		n=sc.nextInt();
	
for(int i=0;i<n;i++)
{
	System.out.println("enter the nos =");
	 no=sc.nextInt();
	

 sum+=no;
 
	}
avg=sum/n;
System.out.println("sum ="+sum);
System.out.println("avg ="+avg);}
}
