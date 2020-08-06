package lab3;

class P5 {
public static<e>void printArray( e[] array)
{
	for(e Element : array)
	{
		System.out.print(Element);
	}
	System.out.println();
}
	public static void main(String[] args)
	{
		
Integer[] k=new Integer[]{1,2,3,4,5,6,7,8};
String [] m=new String[]{"a", "b "};
printArray(k);
printArray(m);
	}

   }

