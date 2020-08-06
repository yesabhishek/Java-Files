package lab3;
class box<T>

{
	T x;
	box(T a)
	{
	
		{
			x=a;
		}
		
}
		void set(T a)
		{
			x=a;
		}
		T get()
		{
			return x;
		}
	}

class P4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
box<Integer>b1=new box<Integer>(10);
box<Integer>b2=b1;
System.out.println(b1.get());
System.out.println(b2.get());
b1.set(20);
System.out.println(b1.get());
System.out.println(b2.get());
System.out.println();

box<String>s1=new box<String>("hello");
box<String>s2=s1;
System.out.println(s1.get());
System.out.println(s2.get());
s1.set(" hello ");
System.out.println(s1.get());
System.out.println(s2.get());
System.out.println();


box<Object>o1=new box<Object>("hello");
box<Object>o2=o1;
System.out.println(o1.get());
System.out.println(o2.get());
o1.set(10);
System.out.println(o1.get());
System.out.println(o2.get());

	}
	

}
