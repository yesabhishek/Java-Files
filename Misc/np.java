package programs;

import java.util.Scanner;

public class np {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=0,no;
		  System.out.println("enter the max range");
		  no=sc.nextInt();
		  int i,k,j;
	        for(i=1;i<=no;i++)
	        {
	            k=0;
	            for(j=2;j<i;j++)
	            {
	                if(i%j==0)
	                {
	                    k=1;
	                    break;
	                }
	            }
	            if(k==0)
	            {
	                System.out.print(i+" ");
	            }
	           // else
	            //	 System.out.print("lol");//
	        }
	    }
	}

	