package Lab8;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no,d,r=1,s=0,n;
		  System.out.println("enter the no");
		  no=sc.nextInt();
		n=no/2;
		d=n;
		for(int i=0;i<d;i++){
			if(n*n==no){
				s=n;
			break;
			}
			n--;
}System.out.println(s);
}}