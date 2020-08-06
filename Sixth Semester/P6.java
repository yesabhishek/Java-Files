package lab7;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int ar[]=new int[6],pos;
		System.out.println("enter the elements ");
		for(int i=0;i<6;i++){
			ar[i]=sc.nextInt();
			}
		System.out.println("Enter the position in which you want to delete the element ");
		pos=sc.nextInt();
		
		
		
			for(int i=0;i<6;i++){
	ar[pos]=0;
		
System.out.println(ar[i]);
}
			sc.close();}}
