package programs;

import java.util.Scanner;

public class sumofeleinar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int ar[]=new int[6],sum=0;
		System.out.println("enter the elements to be iserted !");
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
			
		
		sum=sum+ar[i];}
		System.out.println(sum);
		}
	}


