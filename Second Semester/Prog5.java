package lab2;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter avalue of x=");
		x=sc.nextInt();
		x=x*x;
		System.out.print("The square of x is "+x);
		sc.close();
	}

}
