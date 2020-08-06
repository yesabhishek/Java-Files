package lab7;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int ar[]=new int[10],e=0,o=0,p=0,n=0,sum=0;
		
		for(int i=0;i<10;i++)
	{	System.out.println("enter the elements to be iserted !");
		ar[i]=sc.nextInt();

		sum=sum+ar[i];
		
		if (ar[i]>p){p++;}
		if(ar[i]<n){n++;}
		if(ar[i]%2==0){e++;}
		else{o++;}
}System.out.println("even"+e);
System.out.println("odd"+o);
System.out.println("positive "+p);
System.out.println("negative "+n);
System.out.println("sum="+sum);
sc.close();}}