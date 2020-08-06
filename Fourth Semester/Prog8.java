package lab4;
import java.util.*;
public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the the table which trouble you the most..?");
no=sc.nextInt();
for(int x=1;x<=10;x++){
	System.out.println(no+" X "+x+" = "+no*x);
}sc.close();
	}

}
