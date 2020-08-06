package lab5;

import java.util.Scanner;

public class prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1,p=1,no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. for ypur factorial = ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){fact=fact*i;}
		System.out.println("the factorial of "+n+ " is "+fact);
		
		System.out.println("Enter the no. for power funtion = ");
		no=sc.nextInt();
		for(int j=0;j<=no;j++){p=p*no;}
		System.out.println("the power  of "+no+ " is "+p);
		System.out.println("the final result is"+p/fact);
	}

}
