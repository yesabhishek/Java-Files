package Lab6;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n,a=0,b=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value for fibonacci series = ");
		n=sc.nextInt();
	int i=2;
	while(i<n){
		System.out.print(a+" ");

		System.out.print(b+" ");
		a=a+b;
		b=a+b;
		i=i+2;
		
	}if(i==n){System.out.print(a+" ");

	System.out.print(b);}
	else System.out.print(a); 
	sc.close();
		
		
			
		}
		
			
	
	}


