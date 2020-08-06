package lab7;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int ar[]=new int[6],s,i,not=0;
		System.out.println("enter the elements to be inserted !");
		for( i=0;i<6;i++)
	{	
		ar[i]=sc.nextInt();
		}
	
		System.out.println("enter the elements to be searched !");
		s=sc.nextInt();for(i=0;i<6;i++){
			
	if(ar[i]>=s){not++;
	System.out.println("yes! the no is present  ");
	}
	else{System.out.println("not present");


}
	System.out.println(not);
}sc.close();}}