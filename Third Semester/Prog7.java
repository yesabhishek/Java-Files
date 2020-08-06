package prog1;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y;
Scanner  sc= new Scanner(System.in);
System.out.println("Enter your x-coordinate ");
x=sc.nextInt();
System.out.println("Enter your y-coordinate ");
y=sc.nextInt();
if(x>0&&y>0){System.out.println("its in the first quad ");}
else if(x>0&&y<0){System.out.println("its in the fourth quad ");}
else if(x<0&&y<0){System.out.println("its in the third quad ");}
else if(x<0&&y>0){System.out.println("its in the second quad ");}




	}

}
