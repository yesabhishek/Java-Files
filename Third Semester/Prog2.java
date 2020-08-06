package prog1;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m1,m2,m3,m4,total;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your marks for ICP out of 50  ");
m1=sc.nextInt();
System.out.println("Enter your marks for DM out of 50 ");
m2=sc.nextInt();
System.out.println("Enter your marks for UPM out of 50 ");
m3=sc.nextInt();
System.out.println("Enter your marks for  IP out of 50 ");
m4=sc.nextInt();
total=m1+m2+m3+m4;
if (total ==40|total>6){
	System.out.println("Congratulation! You have passed in the exam. ");}
else{System.out.println("Sorry! You have failed in the exam. ");
}

sc.close();
	}

}
