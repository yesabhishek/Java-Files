package prog1;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x1,y1,x2,y2,x3,y3;float slope1,slope2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your x1 co-ordinate ");
x1=sc.nextInt();
System.out.println("Enter your y1 co-ordinate ");
y1=sc.nextInt();
System.out.println("Enter your x2 co-ordinate ");
x2=sc.nextInt();
System.out.println("Enter your y2 co-ordinate ");
y2=sc.nextInt();
System.out.println("Enter your y3 co-ordinate ");
y3=sc.nextInt();
System.out.println("Enter your x3 co-ordinate ");
x3=sc.nextInt();
slope1=(y2-y1)/(x2-x1);
slope2=(y3-y2)/(x3-x2);
if(slope1==slope2){
	System.out.println("the line is collinear ");}
else{System.out.println("the line is not collinear ");}
}

	}
	
	


