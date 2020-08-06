package misc;

class Generic_4 {
static <E extends Number>void fun(E x,E y){
	System.out.println(x.intValue()*y.intValue());
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i=new Integer(100);
Integer i2=new Integer(11);
fun(i,i2);
	}

}
