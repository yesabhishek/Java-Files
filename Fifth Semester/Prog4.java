package lab5;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,marks=0, c=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the nof students =");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
		System.out.println("Enter the marks =");
		marks=sc.nextInt();}
		if(marks>=40){ c++;
		System.out.println("no. of student passed = "+c);
	}
	}
}
