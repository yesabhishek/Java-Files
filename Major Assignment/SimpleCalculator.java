/* Name :ABHISHEK CHOUDHURY
Branch : CSIT 'A'
Reg no : 1641017076
*/
package majorass;
import java.util.*;
public class SimpleCalculator 
{

	SimpleCalculator()
	{
		System.out.println("Created a Simple Calculator Object");
		
	}
	
	   public int multiplicationSimple(int x,int y)
	  {
		int res=x*y;
		return res;
		
	  }
	
	     public int additionSimple(int x,int y)
	   {
		  int res=x+y;
		   return res;
       }
	
	       public int subtractionSimple(int x,int y)
	     {
		   int res=y-x;
		   return res;
	     }
	       
	       public int divisionSimple(int x,int y)
	   	{
	    	int res=(int)x/(int)y;
	    	return res;
	    	
	   	}
	         public double squarerootSimple(double x)
	     	{
	    	
	        	 double res=Math.pow(x,1.0/2); 
	             return res;
	                	         
	   	    }
	       
	           public int remainderSimple(int m,int n)
		      {
		    	
		   		int res=n%m;
		   		return res;
		      }
		public static void main(String[] args)
		{
			SimpleCalculator ob=new SimpleCalculator();
			Scanner sc=new Scanner(System.in);
			int m,n;
			System.out.println("1-Multiplication ");
			System.out.println("2-Addition");
			System.out.println("3-Subtraction");
		    System.out.println("4-Division");
		    System.out.println("5-Square root");
		    System.out.println("6-Remainder");		
		    System.out.println("Enter which operation you want to perform in the calculator:");
			int i=sc.nextInt();
			if(i==1)
			{	System.out.println("Enter 2 numbers");
			     m=sc.nextInt();
			     n=sc.nextInt();
				ob.multiplicationSimple(m,n);
				System.out.println("Result:"+ob.multiplicationSimple(m,n));
				
			}	
				else if(i==2)
				{
				System.out.println("Enter 2 numbers :");
		        m=sc.nextInt();
		        n=sc.nextInt();
			    ob.additionSimple(m,n);
			    System.out.println("Result:"+ob.additionSimple(m,n));
				}
				else if(i==3)
				{
					System.out.println("Enter 2 numbers :");
			        m=sc.nextInt();
			        n=sc.nextInt();
				    ob.subtractionSimple(m,n);
				    System.out.println("Result:"+ob.subtractionSimple(m,n));
				}    
				else if(i==4)
				{	System.out.println("Enter 2 numbers :");
				        m=sc.nextInt();
				        n=sc.nextInt();
				        if(n!=0)
					         {
				        	    ob.divisionSimple(m,n);
				        	   System.out.println("Result:"+ob.divisionSimple(m,n));
					         }
				             
				        else
				        	System.out.println("Invalid Output");
				}	    
				else if(i==5)
				{	System.out.println("Enter any number :");
				        m=sc.nextInt();
				        if(m>=0)
				        {
					        ob.squarerootSimple(m);
				            System.out.println("Result:"+ ob.squarerootSimple(m));
				        }    
				        else
				        	System.out.println("Invalid Output");
				}	    
				else if(i==6)
				{	System.out.println("Enter 2 numbers:");
						m=sc.nextInt();
						n=sc.nextInt();
						ob.remainderSimple(m,n);
						System.out.println("Result:"+ob.remainderSimple(m,n));
				}
			
				else 
					System.out.println("Wrong Input");
					
			}
			
			
		}


