package programs;

import java.util.Scanner;

public class nfibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=0,no,a=0,b=0;
		  System.out.println("enter the max range");
		  no=sc.nextInt();
		//  System.out.print("0" +" "+"1");
		  b=1;a=0;
		  for(int i=1;i<=(no/2);i++){
			 
			  System.out.print(a+" "+b+" ");
			  a=a+b;
			  b=a+b;
			  
		  }
	if(no%2!=0)
		System.out.print(" "+a);

}}
