import java.util.Scanner;

class rem
{
	int a[],temp[];
	int size;
	Scanner sc=new Scanner(System.in);
	public rem (int size)
	{
		a=new int[size];
		temp=new int[size];
		
	}
	
	public  void insert()
	{
		System.out.println(" enter the elements in the array ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
	
	public void remove()
	{
		for(int i=0;i<size;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[i]=a[i];
			}
			if(a[i]==a[i+1])
			{
				temp[i]=a[i+1];
				i++;
			}
	}
		size=temp.length;
		
		for(int i=0;i<size;i++)
		{
			System.out.println(temp[i]);
		}
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
public class rem_dup 
{

	public  void main(String[] args)
	{
		// TODO Auto-generated method stub
		rem r=new rem(5);
		r.insert();
		r.display();
		r.remove();
		r.display();
	
	}

}
