package prog1;

import java.util.Scanner;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hieght,weight,BMI;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter value for hieght=");
		hieght=sc.nextFloat();
		System.out.println("enter avalue of weight=");
		weight=sc.nextFloat();
		BMI=weight/(hieght*hieght);
		if (BMI<18.5){System.out.println("underweight");}
		else if (BMI>18.5&&BMI <24.9){System.out.println("normal weight");}
		else if (BMI>25.5&&BMI <29.9){System.out.println("overweight weight");} 
		else if (BMI>30){System.out.println("obese");} 
		
		 
		sc.close();
	}

}
