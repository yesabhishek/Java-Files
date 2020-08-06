package misc;

class Generic {
static<E>void fun( E p){
	System.out.println(p);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i=new Integer(10);
fun(10);
Double d=new Double(10.4);
fun(10.4);
	}

}
