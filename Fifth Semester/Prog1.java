package lab5;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,temp=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value for A = ");
a=sc.nextInt();
System.out.println("Enter the value for B = ");
b=sc.nextInt();
System.out.println("Enter the value for C = ");
c=sc.nextInt();
temp=a;
a=b;
b=c;
c=temp;
System.out.println("the new value for A = "+a);
System.out.println("the new value for B = "+b);System.out.println("the value for c = "+c);
sc.close();
	}

}
