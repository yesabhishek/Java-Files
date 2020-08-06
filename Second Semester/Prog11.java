package lab2;

import java.util.Scanner;

public class Prog11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float length,breadth,radius,perimeter,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of rect.= ");
		length=sc.nextFloat();
		System.out.println("enter the breadth of rect.= ");
		breadth=sc.nextFloat();
		System.out.println("enter the radius of circle= ");
		radius=sc.nextFloat();
		perimeter=length*breadth;
		area=3.141f*radius*radius;
		
	
		System.out.println("Your perimeter of rectangle is"+perimeter);
		System.out.println("Your area of the circle is"+area);
		sc.close();
		
	}

}
