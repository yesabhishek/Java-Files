import java.util.Scanner;
class stack_menu
{
	int []a;
	int i,j,k,size;
	int max,min;
	Scanner sc=new Scanner(System.in);
	
	public stack_menu(int size)
	{
		a=new int[size];
		i=-1;
	}
	
public int push()
{
	i++;
	size=i;
	System.out.println(" enter the element in the stack => ");
	a[i]=sc.nextInt();
	System.out.println(" do you want to push more ");
	int ch=sc.nextInt();
	if(ch==1)
	{
		push();
	}
	else
	{
		//i++;
		System.out.println(i);
		for(int i1=0;i1<=size;i1++)
		{
			System.out.print(a[i1]+"<=");
		}
	}
	
	return i;
	
	
	
	
	
}
public int pop()
{
	
	size--;
	return size;
	
}

public void display()
{
	System.out.println(" the stack is ");
	for(int i=0;i<=size;i++)
	{
		System.out.print(+a[i]+"=>");
	}
	System.out.println("");
	
}

public void findmax()
{
	for(int i=0;i<=size;i++)
	{
		if(a[i+1]>a[i])
		{ 
			 max=a[i+1];
		}
		
	}
	System.out.print(max);
	
}

public void findmin()
{
	
	
}

public void delmax()
{
	for(int i=0;i<=size;i++)
	{
		if(a[i+1]>a[i])
		{ 
			 max=a[i+1];
		}
		
	}
	
	System.out.print(max);
	
	
}

public void delmin()
{
	
	
}

	
	
}




public class Menu_stack
{

	
	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		int choice;
		stack_menu q=new stack_menu(100);
		do
		{
			
		System.out.println(" *********************** WELCOME TO THE stack *************************");
		System.out.println(" 1.PUSH ");
		System.out.println(" 2.POP ");
		System.out.println(" 3.DISPLAY ");
		System.out.println(" 4.FIND MAX ");
		System.out.println(" 5.FIND MIN ");
		System.out.println(" 6.POP MAX ");
		System.out.println(" 7.POP MIN ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: 
			
			q.push();
			
			break;
		case 2:
			q.pop();
			break;
		case 3:
			
			q.display();
			break;
			
		case 4:
			q.findmax();
			break;
		default://default
			System.out.println("You entered an invalid choice");
			}
			}while(choice != 5);
			
		}
		
		
		

	}


