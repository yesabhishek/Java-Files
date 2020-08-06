package lab5;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0,d=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the value for a=");
		a=sc.nextInt();
		System.out.println("Enter the value for b=");
		b=sc.nextInt();
		System.out.println("Enter the value for c=");
		c=sc.nextInt();
		System.out.println("Enter the value for c=");
		d=sc.nextInt();
		d=d+c;
		c=d-c;
		d=d-c;
		c=b;
		b=c-b;
	    c=c-b;
	    b=a;
	    a=b-a;
	    b=b-a;
	    a=d;
	    a=a+d;
	    d=a-d;
	    a=a-d;
	    
	    
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		sc.close();
	}

}
