package lab5;

import java.util.Scanner;

public class Un {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.  ");
		n=sc.nextInt();
	for(int i=0;i<=n;i++)
		f+=n*i;
	
	
	System.out.println("f= "+f);
}}
