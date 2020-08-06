package prog1;

import java.util.Scanner;

public class Prog12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;char fn,ln,g,ms;
Scanner  ss= new Scanner(System.in);Scanner  sc= new Scanner(System.in);
System.out.println("Enter your First name=");
fn=ss.next().charAt(0);
System.out.println("Enter your Last name=");
ln=ss.next().charAt(0);
System.out.println("Enter your age=");
age=sc.nextInt();
System.out.println("Enter your gender=");
g=ss.next().charAt(0);
if(g=='f'){{System.out.println("Enter your martial status");
ms=ss.next().charAt(0);}
if(ms=='y'){System.out.println("then, i shall call you Mrs."+fn+ln);}
else if (ms=='n'){System.out.println("then, i shall call you Ms."+fn+ln);}}
if(g=='m'){System.out.println("then i shall callyou Mr."+fn+ln);}
	
	
}}
	

	
