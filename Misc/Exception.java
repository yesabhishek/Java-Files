package misc;
class a
{
	public static void main(String args[]){
		int x=50;
		int y=0;int z=0;
		
		try{
			 z=x/y;
		}
		catch(ArithmeticException e){
			System.out.println(" yes the exception has been caught");
			
		}
		System.out.println(z);
		System.out.println("ITER");
		System.out.println("SOA");
		
	}
}

