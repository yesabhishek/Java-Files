class select
{
	int n;
	int a[];
	Scanner sc=new Scanner(System.in);
	
	public select(int size)
	{
		a=new int[size];
		n=0;
	}
	public void insert(int value)
	{
		
		a[n]=value;
		n++;
	}
	
	public void display()
	{
		for(int i=0;i<n;i++){
			System.out.println(" the eles are "+ a[i]);
		}
	}
	
	public void bub_sort()
	{
		int i,j;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j+1]<a[j])
					swap(j+1,j);
			}
		}
		
	}
		
	

public void swap(int one,int two)
{
	int temp=a[one];
	a[one]=a[two];
	a[two]=temp;
}


}

public  class Select_sort {

	
	 
	public static void main(String[] args) 
	{
		int size=10;
		select b=new select(size);
		b.insert(10);
		b.insert(50);
		b.insert(30);
		b.insert(80);
		b.insert(10);
		b.insert(20);
		b.insert(30);
		b.display();
		b.bub_sort();
		System.out.println("after sorting array ");
		b.display();
		}
	}


