package lab5;
import java.util.*;
public class bitwiseoprnts {

	public static void main(String[] args) {
		int a,b=0;
		System.out.println("enter two operants ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("bit wise and operator is going to be performed ");
	int d=0;
	d=a>>b;
	System.out.println(d);
}}