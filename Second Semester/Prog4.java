package lab2;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter avalue of x=");
		x=sc.nextInt();
		System.out.println("enter value for y=");
		y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.print("new value of x is "+x);
		System.out.println("new value for y is "+y);
		sc.close();
	}

}
