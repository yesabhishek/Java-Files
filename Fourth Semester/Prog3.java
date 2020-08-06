package lab4;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,y,z=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Count from:");
		no=sc.nextInt();
		System.out.println("Count to:");
		y=sc.nextInt();
		System.out.println("increment by ?");
		z=sc.nextInt();
		for(int x=no;x<=y;x+=z){
			System.out.println(x+" ");
		}sc.close();
	}

}
