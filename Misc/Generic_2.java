package misc;

class Generic_2 

{

	static<E extends Number>void fun(E x,E y)
	{
	
		System.out.println(x.intValue()+y.intValue());

	}
	public static void main(String[] args) 
	
	{
		

		Integer i=new Integer(10);

		Integer i2=new Integer(11);

		fun(i,i2);
	}
			
	
}


