package lab2;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hieght,weight,BMI;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter value for hieght=");
		hieght=sc.nextFloat();
		System.out.println("enter avalue of weight=");
		weight=sc.nextFloat();
		BMI=weight/(hieght*hieght);
		System.out.println("The body mass index (BMI)="+BMI);
		sc.close();
		
	
		
	}

}
