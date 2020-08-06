package Lab6;

import java.util.Scanner;

public class Prog11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0,n,rem=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for reversing = ");
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}sc.close();System.out.println("here is the reversing  ");
		System.out.println(rev);
		};
	}


