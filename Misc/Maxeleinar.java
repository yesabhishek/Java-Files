package programs;

import java.util.Scanner;

public class Maxeleinar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int ar[]=new int[6],max=0;
		
		for(int i=0;i<6;i++)
	{	System.out.println("enter the elements to be iserted !");
		ar[i]=sc.nextInt();
		
	
		if(ar[i]>max)
	
		max=ar[i];	
	}
		System.out.println(max);
	}

}
