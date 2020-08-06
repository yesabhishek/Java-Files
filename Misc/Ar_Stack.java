import java.util.Scanner;


class Ar_Stack 
{

	static int top=-1;
	final static int size=5;
	static int a[]=new int[size];
	
	public static void push(int x)
	{
		if(top==size-1)
		{
			System.out.println(" overflow condition ");
			return;
			
		}
		
		top++;
		a[top]=x;
		
	}
	
	public static void pop()
	{
		
		if (top==-1)
		{
			System.out.println(" underflow condition ");
			return;
		}
		int t=a[top];
		System.out.println(" delete element ");
		top--;
		
	}
		public static void display()
		{
			if(top==-1)
			{
				System.out.println(" underflow condition ");
				return;
			}
			
			int t=top;
			while(t!=-1)
			{
				
				System.out.println(a[t]);
				t--;
			}
		}
		
		
		
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("************MENU***********");
			System.out.println("1) insert ");
			System.out.println("2) delete ");
			System.out.println("3) display ");
			System.out.println("4) exit ");
			
			System.out.println(" enter the choice ");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: push(ch);
			break;
			case 2: pop();
			break;
			case 3: display();
			break;
			
			}
		}
		
		while (ch!=4);
			}
			
			
		
}
