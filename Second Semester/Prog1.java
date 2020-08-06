package lab2;

import java.util.Scanner;

public class Prog1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int no,marks,failed=0,passed=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of students :");
		no=sc.nextInt();
		for(int i=0;i<=no;i++)
		{
		System.out.println("Enter the marks of the students :");
		marks=sc.nextInt();
		if (marks<40){
			failed++;
		}
		else 
			passed++;}
		
		
		System.out.println("no. of students passes = "+passed +"no of students faied are ="+failed);
		
	    sc.close();}}
	   
	    	
	


