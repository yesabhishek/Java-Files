package prog1;

import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age1,age2,age3;
Scanner  sc= new Scanner(System.in);
System.out.println("Enter your rahul's age  ");
age1=sc.nextInt();
System.out.println("Enter your ayush's age  ");
age2=sc.nextInt();
System.out.println("Enter your ajay's age  ");
age3=sc.nextInt();
if (age1<age2&&age1<age3){System.out.println("rahul is the youngest of all ");}
if (age2<age1&&age2<age3){System.out.println("ayush is the youngest of all ");}
if (age3<age2&&age3<age1){System.out.println("ajay is the youngest of all ");}


	}

}
