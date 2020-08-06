import java.util.Scanner;
public class StackDemo1
{
	public static int push(int s[],int top)
	{
		int item;
		if(top==MAX-1)
		{
			System.out.println("Memory Overflow");
			System.exit(0);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Item:");
		item=sc.nextInt();
		top++;
		s[top]=item;
		return top;		
	}
	public static int pop(int s[],int top)
	{
		int item;
		if(top==(-1))
		{
			System.out.println("Memory Underflow");
			System.exit(0);
		}
		item=s[top];
		top--;
		System.out.println("Item Popped= "+item);
		return top;
	}
	public static void display(int s[],int top)
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(s[i]);
		}
	}
	public static boolean isEmpty(int top)
	{
		if(top==(-1))
			return true;
		else
			return false;
	}
	public static boolean isFull(int top)
	{
		if(top==MAX-1)
			return true;
		else
			return false;
	}
	public static final int MAX=10;
	public static void main(String s[])
	{
		int top=(-1);
		int stack[]=new int[MAX];
		while(true)
		{
	    Scanner sc=new Scanner(System.in);
		System.out.println("****MENU*****");
		System.out.println("Press 0:Exit");
		System.out.println("Press 1:Push");
		System.out.println("Press 2:Pop");
		System.out.println("Press 3:Display");
		System.out.println("Press 4:Check if empty");
		System.out.println("Press 5:Check if full");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 0:
		System.exit(0);
		break;
		case 1:
		top=push(stack,top);
		break;
		case 2:
		top=pop(stack,top);
		break;
		case 3:
		display(stack,top);
		break;
		case 4:
		System.out.println(isEmpty(top));
		break;
		case 5:
        System.out.println(isFull(top));
		
		}
		}
	}
	
}

	
