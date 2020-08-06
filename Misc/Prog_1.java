class bubble
{
	int n;
	int a[];
	Scanner sc=new Scanner(System.in);
	
	public bubble(int size)
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
		
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]<a[j+1])
					swap(j,j+1);
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

public  class Prog_1 {

	
	 
	public static void main(String[] args) 
	{
		int size=10;
		bubble b=new bubble(size);
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


