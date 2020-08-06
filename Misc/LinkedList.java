import java.util.Scanner;

class link
{
	int info;
	link next;
	link prev;
	
}

public class linkedList
{
	static link start=null;
	
	public static void create( link node)
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
			link temp=new link();
			System.out.println(" enter the new value for the new temp ");
			temp.info=sc.nextInt();
			node.next=temp;
			temp.next=null;
			node=temp;
			temp.prev=node;
			node.prev=null;
			
			System.out.println(" enter 1 to continue and 0 to exit ");
			x=sc.nextInt();
		}
	}
	
		public static void display(link  node)
		{
			//start=node;

			link ptr=new link();
			
			System.out.println("**********displaying in forward direction*********");
			
			
			while(node!=null)
			{
				
				System.out.println(node.info+"->");
				ptr=node;
				node=node.next;
			}
			
			System.out.println("********displaying in backward direction*********");
			
			
			while(ptr!=null)
			{
			
				System.out.println(ptr.info+"-->");
				ptr=ptr.prev;
				
			}
		}
			
		


	public static void main(String[] args) {
		link node=new link();
		//start=node;
		create(node);
		//node=start;
		display(node);
	}

}
