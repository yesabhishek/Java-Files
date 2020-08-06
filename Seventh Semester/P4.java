package Lab8;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	{	
		double m,g1,g2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number whose squarerootis to be found");
		m=sc.nextInt();
		double error=0.0001;
        g2=0.1;
        do {
        	g1=g2;
        	g2=g1*(2-(m*g1));
        } while(Math.abs(g1-g2)>error);
        System.out.println("Reciprocal is "+g2);
        sc.close();
		
		
	
	}

}}
