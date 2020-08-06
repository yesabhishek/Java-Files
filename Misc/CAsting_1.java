package misc;
class alpha
{
	void display()
	{
		System.out.println("ITER");	
	}
}
 class beta extends alpha
 {
	 void print()
	 {
		 System.out.println("SOA");
		 
	 }
 }
class CAsting_1 
{

	public static void main(String[] args) 
	
	{
		
		alpha a1=new alpha();
		try
		{
			beta b1=(beta)a1;
		}
		catch(ClassCastException e)
		{
			System.out.println("exception has been cuaght ");
	
		}
		a1.display();
	}

}
