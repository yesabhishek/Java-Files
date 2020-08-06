package Lab8;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int no,scd=0;
		System.out.println("Enter the no");
		no=sc.nextInt();
		for(int i=2;i<10;i++)
	{	
			if(no%i==0){scd=i;break;
	}
			

}
System.out.println(scd);		
}}