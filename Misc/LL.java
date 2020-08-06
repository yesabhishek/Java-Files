package misc;



import java.util.Scanner;

class linked
{
	int info;
	linked next;
	linked prev;
	
}

public class LL
{
	static linked start=null;
	
	public static void create( linked node)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the value ");
		node.info=sc.nextInt();
		node.next=null;
		node.prev=null;
		
		System.out.println(" enter 1 to continue and  0 to exit ");
		int x=sc.nextInt();
		
		while(x!=0)
		{
			linked temp=new linked();
			System.out.println(" enter the new value for the new temp ");
			temp.info=sc.nextInt();
			node.next=temp;
			temp.next=null;
			
			temp.prev=node;
			node=temp;
			
			System.out.println(" enter 1 to continue and 0 to exit ");
			x=sc.nextInt();
		}
	}
	
		public static void display(linked  node)
		{
			while(node.next!=null)
			{
				System.out.print(node.info+"->");
				node=node.next;
				
				
			}
			
		
		}
			
		


	public static void main(String[] args) {
		linked node=new linked();
		start=node;
		create(node);
		node=start;
		display(node);
	}

}
