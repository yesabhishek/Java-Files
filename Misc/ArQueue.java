import java.util.Scanner;


public class ArQueue 
{
	final static int size=5;
	static int ar[]=new int[size];
	static int rear =-1;
	static int front=-1;

	public static void insert(int x)
	{
		if(rear==size-1)
		{
			System.out.println(" overflow condition ");
			return;
			
		}
		
		if (front==-1)
		{
			front=0;
			rear=0;
			
		}
		
		else 
		{
			rear++;
		}
		ar[rear]=x;
		
		
		
		}
	
	public static void delete()
	{
		if (front==-1)
		{
			System.out.println(" Overflow condition ");
			return;
			
		}
		int t=ar[front];
		System.out.println(" enter the element to delete " +t);
		if(front==rear)
		
		{
			front=-1;
			rear=-1;
			
		}
		
		else 
		{
			front++;
		}
		
		}
	
	public static void display()
	{
		if( front==-1)
		{
			System.out.println(" overflw conditon ");
			return;
			
		}
		
		for( int i=front; i<=rear; i++)
		{
			System.out.println(ar[i]);
		}
	}
	
		
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch;
	
		do
		{
			System.out.println("****************MENU****************");
			System.out.println(" 1) INSERT ");
			System.out.println(" 2) delete ");
			System.out.println(" 3) display ");
			System.out.println(" 4) EXIT ");
			
			ch=sc.nextInt();
		
			switch(ch)
			{
			
			case 1:insert(5);
			break;
			
			case 2: delete();
			break;
			
			case 3: display();
			break;
			
			}
		}
		while(ch!=4);
	}

			

	}

