package Lab6;

import java.util.Scanner;

public class Xkasq {

	public static void main(String[] args) {
		float x=1,sum=1,p=1,i;
		System.out.println("enter uptill where");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		for(i=1;i<x;i++)
		{
			p*=i/i;
			sum=(sum+p)/i;
			
		}
		
		System.out.println(sum/i);
		

	}

}
