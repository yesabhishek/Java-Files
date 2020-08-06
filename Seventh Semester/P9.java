package Lab8;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		prog8 ap=new prog8();
		int m=0,n=0;
		System.out.println("enter the first no");
		m=sc.nextInt();
		System.out.println("enter the Second no. ");
		n=sc.nextInt();
		int res=ap.add(m,n);
		System.out.println("The GCD is "+res);
			
			}
			int add(int m,int n)
			{
				 int r=0, a, b;
				 
			        a = (m > n) ? m : n; 
			        b = (m < n) ? m : n; 
			 
			   do     r = b;
			    while  (a % b != 0);
			        {
			            r = a % b;
			            a = b;
			            b = r;
			        
			       
					return r;
			}
			}}	

		

	


