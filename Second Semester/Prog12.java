package lab2;

import java.util.Scanner;

public class Prog12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quater,half,one;float total;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how amny quarter you have= ");
		quater=sc.nextInt();
		System.out.println("enter how many half rupee you have= ");
		half=sc.nextInt();
		System.out.println("enter how many one rupee you have ");
		one=sc.nextInt();
		total=0.25f*quater+0.50f*half+1.0f*one;
	
		System.out.println("the total money you have="+total);
	
		sc.close();
		
	}
	}


