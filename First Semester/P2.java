package lab3;

class P2 {

	public static void main(String[] args) {
		
			String a[]={"Red","blue","black",null};
			try{
				System.out.println(a[3]);
			//	int l=a[2].length();
			//	System.out.println("Length : "+l);
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}

			try
			{
				a[4]="violet";
				System.out.println(a[3]);
			}
		catch(ArrayIndexOutOfBoundsException n)
		{
			System.out.println(n);
		}
		}
		}