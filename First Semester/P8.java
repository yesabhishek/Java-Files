package lab3;

class P8 {
 static int fun(int x , int n){
	 if(n==0){
		 return 1;
		 
	 }
	 else if(n==1){
		 return x;
	 }
	 else{
		 return(x*(fun(x,n-1)));
	 }
	 
 }
	public static void main(String[] args) {
		int z=fun(4,3);
		System.out.println(z);
	}

}
