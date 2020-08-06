package lab5;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=0,c=0,temp=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the value for a=");
a=sc.nextInt();
System.out.println("Enter the value for b=");
b=sc.nextInt();
System.out.println("Enter the value for c=");
c=sc.nextInt();
temp=b;
b=c;
c=a;
System.out.println(a);
System.out.println(b);
System.out.println(temp);
sc.close();



	}

}
