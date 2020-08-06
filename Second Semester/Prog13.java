package lab2;

import java.util.Scanner;

public class Prog13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,left,gross,dozen,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many eggs you have= ");
		n=sc.nextInt();
		
		left=n%12;
		gross=n/144;
		dozen= (n)-(gross*144)-(left);
		d=dozen/12;		
		
	
		System.out.println("Your number of eggs is " +gross+ " gross, " +d+" dozen and " +left+".");
	
		sc.close();
	}

}
