package lab5;

import java.util.Scanner;

public class Prog8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0,no=0,sum=0,h=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of nubers you want to insert ");
		n=sc.nextInt();
	
for(int i=0;i<=n;i++)
{
	System.out.println("enter the nos =");
	 no=sc.nextInt();
	

 sum+=no*no;
 //h=n/(sum*(1/no));
}
System.out.println("Summation =  "+sum);
System.out.println("HARMONIC SEQUENCE = "+h);

}}