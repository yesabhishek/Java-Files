

import java.util.Scanner;

class linked
{
	int info;
	linked next;
}


class Stack
{
	static linked top=null;
	
	public static void insert()
	{
		Scanner sc=new Scanner(System.in);
		linked node=new linked();
		System.out.println(" enter the value ");
		node.info=sc.nextInt();
		node.next=top;
		top=node;
		
	}

	public	 static void display()
	{
		linked ptr=new linked();
		ptr=top;
		
		if(top==null)
		{
			System.out.println(" underflow condition ");
			return;
		}
		
		while(ptr!=null)
		{
			System.out.print(ptr.info+"->");
			ptr=ptr.next;
		}
	}

	public static void delete()
	{
		if(top==null)
		{
			System.out.println(" underflow condition ");
			return;
		}
		top=top.next;
		
	}

public static void main(String[] args) 
{

	Scanner sc=new Scanner(System.in);
	int ch;
	
	linked node=new linked();
	//top=node;
	
	do
		
	{
		System.out.println("******************MENU***************");
		System.out.println(" 1)  create ");
		System.out.println(" 2)  display ");
		System.out.println(" 3)  delete ");
		System.out.println(" 4)  exit ");
		
		ch=sc.nextInt();
		if(top==null)
		{
			System.out.println(" underflow condition ");
		}
		switch(ch)
		{
		case 1:insert();
		break;
			
		

		
	case 2:  
				display();
				break;
				
		 
	
	case 3: delete();
	break;}}
	
		while(ch!=4);
				
				
		
	
	}

}
