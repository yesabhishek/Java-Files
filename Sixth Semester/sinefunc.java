package Lab6;
import java.util.Scanner;


public class sinefunc {

	public static void main(String[] args)
	  {  int i=1;
	    
	     double error=1e-6;
		 Scanner sc=new Scanner(System.in);
		 double x,term=0;
		 System.out.println("Enter the value of sin");
		 x=sc.nextDouble();
		 x=(Math.toRadians(x));
		 double vsin=0;
		 i=1;
		 while(Math.abs(term)>error)
		 {
			  i+=2;
			 
			 term=(x*x)/(i*(i-1))*(-term);vsin+=term;
			 //term=-term;
		 }
		 
		 System.out.println(vsin);
		 
		 
		 
		 
		 
		 
		 
	}

	

}
