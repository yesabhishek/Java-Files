
class alpha
{
	int a[];
	int n,d;
	Scanner sc=new Scanner(System.in);
	public alpha(int size)
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
		for(int i=0;i<n;i++)
		{
			System.out.println(" the eles are "+a[i]);
		}
	}
	
	public void delete()
	{
		System.out.println(" enter the ele to be deleted ");
		d=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==d)
			{
				for(int j=0;j<n-1;j++)
				{
					a[j]=a[j+1];
				}
				
			}
		}
	}
	
	
}


class del 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		alpha a=new alpha(10);
		a.insert(5);
		a.insert(10);
		a.insert(11);
		a.insert(6);
		a.display();
		a.delete();
		a.display();
		
	}

}
