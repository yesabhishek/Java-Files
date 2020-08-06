import java.util.Scanner;
class double_ended
{
	int []a;
	int []temp;
	int i,size;
	Scanner sc=new Scanner(System.in);
	
	public double_ended(int size)
	{
		a=new int[size];
		temp=new int[size];
		i=0;
	}
	
public int push()
{
	
	System.out.println(" enter the element in the queue => ");
	a[i]=sc.nextInt();
	System.out.println(" do you want to push more ");
	int ch=sc.nextInt();
	if(ch==1)
	{
		i++;
		size=i;
		push();
	}
	else
	{
		i++;
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
	for(int i=0;i<size;i++)
	{
		a[i]=a[i+1];
		a[i+1]=a[i+2];
		
	}
	size--;
	return size;
}

public void display()
{
	System.out.println(" the queue is ");
	for(int i=0;i<=size;i++)
	{
		System.out.print(+a[i]+"<=");
	}
	System.out.println("");
	
}

public void findmax()
{
	
	
}

public void findmin()
{
	
	
}

public void delmax()
{
	
	
}

public void delmin()
{
	
	
}
public void del_dup()
{
	
	
	   // Start traversing elements 
    int j = 0; 
    for (int i=0; i<size-1; i++) 
    { if (a[i] != a[i+1]) 
    {   temp[j++] = a[i]; 
    }
    }
   
    temp[j++] = a[size-1];    
      
    // Modify original array 
    for (int i=0; i<j; i++) 
    {  a[i] = temp[i];   
    System.out.println(a[i]);

	
} 
}

}




public class dequeue 
{

	
	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		int choice;
		double_ended q=new double_ended(100);
		do
		{
			
		System.out.println(" *********************** WELCOME TO THE QUEUE *************************");
		System.out.println(" 1.PUSH ");
		System.out.println(" 2.POP ");
		System.out.println(" 3.DISPLAY ");
		System.out.println(" 4.FIND MAX ");
		System.out.println(" 5.FIND MIN ");
		System.out.println(" 6.POP MAX ");
		System.out.println(" 7.POP MIN ");
		System.out.println(" 8.DELETE DUPLICATE  ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: 
			//int i=0;
			q.push();
			break;
		case 2:
			q.pop();
			break;
		case 3:
			q.display();
			break;
		case 8:
			q.del_dup();
			break;
		default://default
			System.out.println("You entered an invalid choice");
			}
			}while(choice != 5);
			
		}
		
		
		

	}


