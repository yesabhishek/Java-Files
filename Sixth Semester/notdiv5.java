package Lab6;
import java.util.*;
public class notdiv5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0;

Scanner sc=new Scanner(System.in);
Scanner ss=new Scanner(System.in);

System.out.println("Do u have the number");
char opt;
opt=ss.next().charAt(0);

while(opt=='y'||opt=='Y')
{
System.out.print("Enter the no ");
	n=sc.nextInt();
	if(n%2==0)
		System.out.println("Smallest divisor of "+n+" is "+2);
	else if(n%3==0)
         System.out.println("Smallest divisor of "+n+" is "+3);
	else if(n%3==0||n%5==0)
        System.out.println("Smallest divisor of "+n+" is "+3);
	else if(n%5==0)
        System.out.println("Smallest divisor of "+n+" is "+5);

else 
	
	System.out.println("IGNORED CASE");

	System.out.println("WANNA TRY MORE (Y/N)");
	
	opt=ss.next().charAt(0);

	
	
}
	
}}

