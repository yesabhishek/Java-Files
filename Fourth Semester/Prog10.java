package lab4;

import java.util.Scanner;

public class Prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no ");
no=sc.nextInt();
for(int x=1;x<=no;x++){

	System.out.print(x);

}
for(int j=(no-1);j>=1;j--){System.out.print(j);
}sc.close();
	}

	}


