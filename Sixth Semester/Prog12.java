package Lab6;

import java.util.Scanner;

public class Prog12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int n,sum=0;
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the no ");
			n=sc.nextInt();
			while(n>0){
				
				n=n/10;sum++;
	}
System.out.println(sum);
}
}