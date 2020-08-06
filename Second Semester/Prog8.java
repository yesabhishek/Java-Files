package lab2;

import java.util.Scanner;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float first,sec,third,cal;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first no.= ");
		first=sc.nextFloat();
		System.out.println("enter avalue of second=");
		sec=sc.nextFloat();
		System.out.println("enter avalue of third=");
	third=sc.nextFloat();
		cal=(first+sec+third)/2;
		System.out.println("the calculation="+cal);
		sc.close();
		
	
	}

}
