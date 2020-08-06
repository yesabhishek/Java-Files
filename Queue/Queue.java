import java.util.Scanner;

class alpha
{
	int i=0,j=0,max,min;
	int []a;
	Scanner sc=new Scanner(System.in);
	public alpha(int size)
	{
		a=new int[size];
	}
	
	public void push()
	{
		
		
		a[i]=sc.nextInt();
		i++;
		max=i;
	}
	
	public int pop(int size)
	{
		size=size-1;
		
		for(int i=0;i<size;i++)
		{
			a[i]=a[i+1];
			
		}
		System.out.println("");
		//System.out.print("size in pop "+size);
		return size;
	}
	
	public void display(int p)
	{
		//System.out.println(size);
		System.out.print(" The elements in the queue are ");
		for( i=0;i<p;i++)
		{
			System.out.print(" => "+a[i]);
		}
		
	}
	
	
}
	public class Queue 
{


	public static void main(String[] args) 
	{
		int p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the size if the queue ");
		int size=sc.nextInt();
		alpha a=new alpha(size);
		System.out.println(" enter the elements of the queue => ");
		for(int i=0;i<size;i++)
		{
			
			a.push();
		}
		a.display(size);
		
		p=a.pop(size);
		a.display(p);
		
		p=a.pop(p);
		a.display(p);
		
		p=a.pop(p);
		a.display(p);
		
		
		
		
	}

}
