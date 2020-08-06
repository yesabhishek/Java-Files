package lab3;

class P7 {

	static int  fun(int x)
	{
		if(x==0||x==1)
		{
			return 1;
			
		}
		else{
		return(x*fun(x-1));
		}
		
	}
	public static void main(String[] args) {
		int z=fun(4);
		System.out.println(z);
	}

	}


