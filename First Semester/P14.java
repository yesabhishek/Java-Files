package lab3;

class P14 {
static int fun(int a , int b){
	if(b==0)
		return 0;
	
	else
		return(a+fun(a,b-1));

	
}
	public static void main(String[] args) {
		int z=fun(4,3);
		System.out.println(z);

	}

}
