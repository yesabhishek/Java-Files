package lab2;

import java.util.Scanner;

public class Prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Fahrenheit degrees");
		f=sc.nextFloat();
		c=f/9*(f-32);	
		System.out.println("degree in Centigrade degrees "+c);
		sc.close();
		
	}

}
