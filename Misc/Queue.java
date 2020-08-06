import java.util.Scanner;

class demo
{
	int info;
	demo front=-1;
	demo rear=-1;
	
}
public class Queue 
{
	static demo front;
	static demo rear;
	
	public static void insert()
	{
		Scanner sc=new Scanner (System.in);
		demo node=new demo();
		System.out.println(" enter the value ");
		node.info=sc.nextInt();
		
		
		if (front==null)
		{
			System.out.println(" nothing to display ");
			front=node;
			rear=node;
			return;
		}
		 else 
		{
			rear.next=null;
			rear=node;
		}
		node=rear.next;
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
