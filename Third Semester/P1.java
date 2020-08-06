package lab9;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
long n,x,k=1;
System.out.println("enter the digit :");
x=sc.nextInt();
System.out.println("enter the power of the digit");
n=sc.nextInt();

for(int i=1;i<=n;i++)
{k=k*n;
	}
System.out.println(k);}
}
