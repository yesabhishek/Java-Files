package programs;

import java.util.Scanner;

public class simplearray {

	public static void main(String[] args) {
	
		Scanner  sc=new Scanner(System.in);
		int ar[]=new int[10];
		System.out.println("enter the elements to be iserted !");
		for(int i=0;i<10;i++)
	{
		ar[i]=sc.nextInt();
		
	}
		for(int i=9;i>=0;i--)
	{	
		System.out.println(ar[i]);
		System.out.println();
	}
		for(int i=0;i<10;i++)
		{	
			System.out.println(ar[i]);
		}
	}

}
