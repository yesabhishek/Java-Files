package programs;

import java.util.Scanner;

public class Sqroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no,d,r,s=0,n;
		  System.out.println("enter the no");
		  no=sc.nextInt();
		n=no/2;
	        for(int i=1;i<=n;i++)
	        {
		r=no/i;
		if((r-i)==0){
			s=i;
		}}
	System.out.println(s);

}}
