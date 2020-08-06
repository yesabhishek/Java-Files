package lab2;

import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,feet,inches;float weight;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter avalue of age=");
		age=sc.nextInt();
		System.out.println("enter value for feet=");
		feet=sc.nextInt();
		System.out.println("enter value for inches=");
		inches=sc.nextInt();
		System.out.println("enter avalue of weight=");
		weight=sc.nextFloat();
		
		System.out.println("So, you're "+age+" years old, "+feet+"'"+inches+"\" tall and "+weight+" KG heavy.");
		
		
		sc.close();
	}

}
