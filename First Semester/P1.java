package lab3;

import java.util.Scanner;


class P1 

{

	public static void main(String[] args) 
	
	{
		
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the lucky no ");
		x=sc.nextInt();
		
		
			try
			
			{
				if(x<0)
				
				{ 
					throw new NumberFormatException(" invalid input");
				}
				else
				{
					System.out.println(x);
				}
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" the no is "+ x +" "+" and the exception is "+ e);
			}
					
		}
	}

	


