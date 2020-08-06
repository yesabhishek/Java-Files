package programs;

import java.util.Scanner;

public class own {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long no,temp=0;
		  System.out.println("enter the max range");
		  no=sc.nextInt();
		  int i;
		  System.out.print("2"+" " +"3"+" "+"5"+" "+"7 ");
		  
	        for(i=4;i<=no;i++)
	        {
	        	
	        	if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0){
	        		System.out.print(i+" ");
	        		temp++;}
	        	}
	        System.out.println("\n there are total"+" "+(temp+4)+" prime nos between 1 and "+no);   }
	}


