package programs;

import java.util.Scanner;

public class nprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		  int n,p=0;
		  System.out.println("enter the max range");
		  n=sc.nextInt();
		  for (int i = 2; i <=n; i++)
	      {
		   for (int j = 2; j <=n; j++)
		    {
		      if ((i % j) == 0)
	          {
		        if(i != j)
		       {  
		        break;
		       }
		      
			 else
	          {
			   p=i;
			   System.out.print(p+" ");
			  }
			}
		  }
		}
	}}

