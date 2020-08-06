package misc;

class Generic_3 
{
	static<E extends Number>void fun(E x,E y)
	{
		if(x.intValue()>y.intValue())
		{
			
			System.out.println(" the greater no is "+ x.intValue());
		
		}
	else
		System.out.println(" the greatest no is "+ y.intValue());
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Integer i=new Integer(10);
		Integer i2=new Integer(20);
		fun(i,i2);

	}

}
