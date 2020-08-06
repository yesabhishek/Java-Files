package Lab8;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m,g1,g2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		m=sc.nextInt();
		double error=0.25;
	    g2=m/2;
	    do {
	    	g1=g2;
	    	g2=(g1+m/g1)/2;
	    } while(Math.abs(g1-g2)>error);
int z=g2+1;
int Sqr=z*z;
System.out.println("the integer is "+Sqr );
sc.close();
	}

}
