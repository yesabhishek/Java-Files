package prog1;

import java.util.Scanner;

public class prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
Scanner sc = new Scanner(System.in);
System.out.println("enter your year of birth=");
year=sc.nextInt();
if (year>=1966&&year<=1980){System.out.println("GENERATION = X");}
if (year>=1981&&year<=1999){System.out.println("GENERATION Y");}
if (year>=2000&&year<=2012){System.out.println("GENERATION z");}
	}

}
