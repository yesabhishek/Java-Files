import java.util.Scanner;
class priority
{
	Scanner sc=new Scanner(System.in);
	int ch,size,i=0,j;
	int []a;
	int temp=0;
	
	public priority(int size)
	{
		a=new int[size];
		
		
}
	
	public int push()
	{
		System.out.println(" enter the elements in the queue ");
		a[i]=sc.nextInt();
		System.out.println(" you want to enter more ? ");
		ch=sc.nextInt();
		if(ch==1)
		{
			i++;
			size=i;
			push();
			sort();
		}
		else
		{
			i++;
			sort();
			
		}
		
		return i;
	}
	
	public void sort()
	{
		for(int i=0;i<size-1;i++)
		{
			
		
			if(a[i]>a[i+1])
			{
				
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			}
		}
		
	
	
	public void display()
	{
		for(int i=0;i<=size;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public int  pop()
	{
		for(int i=0;i<size;i++)
		{
			a[i]=a[i+1];
			a[i+1]=a[i+2];
			
		}
		size--;
		return size;
		
}
}
public class priority_queue
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		priority p=new priority(50);
		do
		{
			
		System.out.println(" *********************** WELCOME TO THE PRIORITY QUEUE *************************");
		System.out.println(" 1.PUSH ");
		System.out.println(" 2.POP ");
		System.out.println(" 3.DISPLAY ");
		
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: 
			//int i=0;
			p.push();
			break;
		case 2:
			p.pop();
			break;
		case 3:
			p.display();
			break;
		
		default://default
			System.out.println("You entered an invalid choice");
			}
			}while(choice != 4);
			
		}
		
		
		

	}


