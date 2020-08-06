package lab3;
import java.util.Scanner;

class 	MarksOutOfBoundException extends Exception 
{
	static int marks;

public void error()
{
	System.out.println(" the no is "+marks);
}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the name of the student ");
		String name=sc.next();
		System.out.println("enter the marks obtained ");
		marks=sc.nextInt();
		 try{
			 if(marks>100){
				 throw new MarksOutOfBoundException();
				}}
			catch(MarksOutOfBoundException e){
				e.error();
			}
					
	
			 }
		 
		
	}


