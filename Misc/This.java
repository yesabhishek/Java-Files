package misc;

class bakra 
{
	int x;
	String y;
	
	bakra()
	{
		System.out.println(" ITER ");
	}
	
	bakra(int x, String y)
	{
		this();
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
class This 
{
	public static void main(String[] args)
	{
		bakra b=new bakra(10, "abc ");
		b.display();
	}
}
