package lab3;

class P10 {
	static int  fun(int x){
		if(x==1){
			return 1;
}
		else if(x==2){
			return 1;
			
		}
		else{return(fun(x-1)+fun(x-2));
			
		}}
	public static void main(String[] args) {
		int x=fun(7);
		System.out.println(x);
	}

}
