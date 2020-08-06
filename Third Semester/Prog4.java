package prog1;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x;
		Scanner ss= new Scanner(System.in);
		x=ss.next().charAt(0);
		int y=x;
		if (y>=65&&y<=90){
		System.out.println("your input is capital letter");}
		if (y>=97&&y<=122){
			System.out.println("your input is small letter");}
		if (y>=48&&y<=57){
			System.out.println("your input is digit");}
		System.out.println(y);
		
		}
	
		
		
		
		
	

	
		
		
	}


