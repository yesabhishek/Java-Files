package programs;

import java.util.Scanner;

public class Baseconvesion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n,base,sum=0;double r = 0;
System.out.println("enetr the no ");
n=sc.nextInt();
System.out.println("enetr the base through which you to convert ");
base=sc.nextInt();
if(base==8){
	for(int i=0;i<=n;i++){
		r=n%10;
		n=n/10;
		r=r*Math.pow(8,i);
		sum+=r;	
	}
	
}
if(base==2){
	for(int i=0;i<=n;i++){
		r=n%10;
		n=n/10;
		r=r*Math.pow(2,i);
		sum+=r;	
	}
	
}
System.out.println(sum);
	
	
	
}}
