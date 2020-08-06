package Lab6;

import java.util.Scanner;

public class Digits_of_the_sum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n,sum=0;
		char opt;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("do you want to enter digit to be sum up(y/n)!");
		opt=sc.next().charAt(0);
		
	
		while(opt=='y')
	{
		System.out.println("enter the next digit ");
		n=sc.nextInt();
		sum=sum*10+n;
		System.out.println("do you have any then , enter the next digit (y/n) !");
		opt=sc.next().charAt(0);
		
		
		
	}
		sc.close();
		System.out.println(sum); 
	}

	}
