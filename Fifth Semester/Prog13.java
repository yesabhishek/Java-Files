package lab5;

import java.util.Scanner;

public class Prog13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. = ");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			System.out.print(k+" ");
			k=k+k;
		}
	}}