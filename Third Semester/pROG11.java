package prog1;

import java.util.Scanner;

public class pROG11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,z;
Scanner sc = new Scanner(System.in);
System.out.println("enter the length of one side of the triangle =");
x=sc.nextInt();
System.out.println("enter the length of second side of the triangle =");
y=sc.nextInt();
System.out.println("enter the length of third side of the triangle =");
z=sc.nextInt();
if(x==y){System.out.println("the triangle is symmetric");}
if(x!=y&&x!=z){System.out.println("the triangle is irregular ");}
if(x==y&&x==z){System.out.println("the triangle is regular ");}
	}

}
