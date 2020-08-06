package lab2;
import java.util.*;
public class Prog3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int x,y,z;
Scanner sc = new Scanner(System.in);

System.out.println("enter avalue of x=");
x=sc.nextInt();
System.out.println("enter value for y=");
y=sc.nextInt();
z=x;x=y;y=z;
System.out.print("new value of x is"+x);
System.out.println("new value for y is"+y);
sc.close();
	}

}
