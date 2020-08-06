import java.util.Scanner;

class helo
{
	int info;
	helo next;
}


public class Stack_final 
{

	static helo top=null;
	
	public static void push()
	{
		Scanner sc=new Scanner(System.in);
		helo node=new helo();
		System.out.println(" enter the value ");
		node.info=sc.nextInt();
		node.next=top;
		top=node;
		
	}
	
	public static void pop()
	
	{
		if(top==null)
		{
			System.out.println(" underflow conditon ");
			return;
		}
		top=top.next;
	}
	
	public static void display()
	{
		helo ptr=new helo();
		ptr=top;
		
		if(ptr==null)
		{
			System.out.println(" underflow confdition ");
			return;
		}
		
		while(ptr!=null)
		{
			System.out.println(ptr.info+"-->");
			ptr=ptr.next;
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		helo node=new helo();
		
		
	}

}
