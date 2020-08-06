package Lab6;

import java.util.Scanner;

public class Prog13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no ");
		n=sc.nextInt();
		while(n>0){
			sum+=n%10;
			n=n/10;
			
			
		}
		System.out.println(sum);
		
	}

}
