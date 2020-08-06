package lab2;

import java.util.Scanner;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float bs,da,hra,gs;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your basic salary= ");
		bs=sc.nextFloat();
	da=0.4f*bs;

		hra=0.2f*bs;
		
	gs=hra+bs+da;
	
		System.out.println("Your gross salary is"+gs);
		sc.close();
		
	}

}
