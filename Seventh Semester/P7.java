package Lab8;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int t=0;
		for(int i=1;i<=100;i++)
	{	
		if(i%2==0&&i%3==0&&i%5==0&&i%7==0)
			t=i;
			if(i%2==0&&i%3==0&&i%5==0)
				t=i;
			if(i%2==0&&i%3==0)
				t=i;
			
	}
System.out.println(t);

}}

