package programs;
import java.util.*;


public class majorass1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Scanner ss=new Scanner (System.in);
		majorass1 t= new majorass1();
		int ch=0;
		int ans = 1;
		do
		{
		System.out.println("\t\t  ----SIMPLE CALCULATOR----\n");
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Nultiplication");
		System.out.println("4) Division");
		System.out.println("5) Remainder");
		System.out.println("6) Square root");
		System.out.print("\nEnter your choice : ");
		ch=sc.nextInt();
		int s=0,s1=0,s2=0,s3=0,s4=0,s5=0;
		int a=0,b=0;
		switch(ch)
		{
		case 1:{
			System.out.print("\n\t\t••••ADDITION••••\n\n");
			System.out.print("Enter your 1st operand: ");
 		     a=sc.nextInt();
 		     System.out.print("Enter your 2nd operand: ");
 		     b=sc.nextInt();
		     s=t.additionSimple(a,b);
		     System.out.println("Answer : "+s);
		     break;
	       }
		case 2: {
			System.out.print("\n\t\t••••SUBTRACTION••••\n\n");
			System.out.print("Enter your 1st operand: ");
	         a=sc.nextInt();
	         System.out.print("Enter your 2nd operand: ");
	         b=sc.nextInt();			   
		     s1=t.subtractionSimple(a,b);
		     System.out.print("Answer : "+s1);
		     break;
		}
		case 3: {
			System.out.print("\n\t\t••••MUNTIPLICATION••••\n\n");
		     System.out.print("Enter your 1st operand: ");
	         a=sc.nextInt();
	         System.out.print("Enter your 2nd operand: ");
	         b=sc.nextInt();
		     s2=t.multiplicationSimple(a,b);
		     System.out.print("Answer : "+s2);
		     break;}
	case 4: {
		System.out.print("\n\t\t••••DIVISION••••\n\n");
		     System.out.print("Enter your 1st operand: ");
            a=sc.nextInt();
            System.out.print("Enter your 2nd operand: ");
            b=sc.nextInt();
		     s3=t.divisionSimple(a,b); 
		     System.out.println("Answer : "+s3);
		     break;
		    }
	case 5: { 
		System.out.print("\n\t\t••••REMAINDER••••\n\n");
		     System.out.print("Enter your 1st operand: ");
            a=sc.nextInt();
            System.out.print("Enter your 2nd operand: ");
            b=sc.nextInt();
		     s4=t.remainderSimple(a,b);
		     System.out.print("Answer : "+s4);
		     break;
		     }
	case 6: {
		System.out.print("\n\t\t••••SQUARE ROOT••••\n\n");
		     System.out.print("Enter your operand: ");
            a=sc.nextInt();
		     s5=(int)t.squarerootSimple(a);
		     System.out.println("Answer : "+s5); 
		     break;
		     }
	default : {
		     System.out.println("Wrong Input ");
	}
		}
		System.out.println("\n\nWant to continue ? \n (YES:1)••••(NO:0)");
		ans=sc.nextInt();
		}
		while(ans!=0);
		}
	public int additionSimple(int x, int y)
    { 
	  int r=0;
      r=x+y;
	  return r;
	  
    }
public int subtractionSimple(int x, int y) 
{
	int r=0;    	
	r=y-x;
	return r;
}

public int multiplicationSimple(int x, int y) 
{
   int r=0;	   
   r=x*y;
	   return r; 
}

public int divisionSimple(int x, int y)
{ 
   int r=0;	   
   if(x!=0)
     {
	   r=y/x;
     }
   return r;
}

public int remainderSimple(int n, int m)
{   
    int r=0;	    
    r=n%m;
    return r;
}

public double squarerootSimple(double n)
 {
   double r=0;
   if(n>0)
	   r=Math.sqrt(n);
   return r;  
   }}
