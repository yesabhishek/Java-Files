package misc;

class Recursion 
{
	static int mul( int a , int b)
	{
		if(b==0)
		{
			return 0;
		}
		else
			return(a*(mul(a,b-1)));
		
		
	}
	public static void main(String[]args)
	{
		int t1= mul(10,5);
		System.out.print(5);
		
	}
}
