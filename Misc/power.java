package programs;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no,p,pow=1;
		  System.out.println("enter the no");
		  no=sc.nextInt();
		  System.out.println("enter the power");
		  p=sc.nextInt();
		for(int i=1;i<=p;i++){
			pow*=no;
		}
System.out.println(pow);
	}

}
