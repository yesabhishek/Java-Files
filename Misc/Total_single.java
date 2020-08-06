import java.util.Scanner;

class link
{
	int info;
	link next;
	
}

public class Total_single
{
	static link start=null;
	
	public static void create( link node)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the value ");
		node.info=sc.nextInt();
		node.next=null;
		
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
			
			System.out.println(" enter 1 to continue and 0 to exit ");
			x=sc.nextInt();
		}
	}
	
	public	 static void display(link node)
		{
		
			while(node!=null)
			{
				System.out.print(node.info+"->");
				node=node.next;
			}
		}
			
		 
		 
	public	static void insert_beg(link node)
		{
			Scanner sc=new Scanner(System.in);
			link curr=new link();
			System.out.println(" enter the value of current ");
			curr.info=sc.nextInt();
			
			start=curr;
			curr.next=node;
						
			
		}


	
	public static void sort( link node)
	
	{
		link ptr1=new link();
		link ptr2=new link();
		
		for( ptr1=node; ptr1.next!=null; ptr1=ptr1.next)
		{
			for( ptr2=ptr1.next;ptr2!=null; ptr2=ptr2.next)
			{
				
				if(ptr1.info>ptr2.info)
				{
					int t=ptr1.info;
					ptr1.info=ptr2.info;
					ptr2.info=t;
					
				}
				
			}
			
		}
	}
			
	public	static void insert_End( link node)
		{
			Scanner sc=new Scanner(System.in);
			link curr=new link();
			System.out.println(" enter the value ");
			curr.info=sc.nextInt();
			
			
			while(node.next!=null)
			{
				node=node.next;
				
				
			}
			
			node.next=curr;
			curr.next=null;
			
			
		}
		
		
		
		public static void insert_loc(link node)
		{
			Scanner sc=new Scanner(System.in);
			int c=1;
			link ptr=new link();
			link curr=new link();
			System.out.println(" enter the value of the current node ");
			curr.info=sc.nextInt();
			System.out.println(" enter the location ");
			int loc=sc.nextInt();
			
			
			while((node!=null)&&(c<loc))
			{
				ptr=node;
				node=node.next;
				c++;
				
			}
			
			if (node==null)
			{
				System.out.println(" invalid input ");
				return;
			}
			
			if (loc==1)
			{
				curr.next=node;
				start=curr;
			}
				else
				{
					ptr.next=curr;
					curr.next=node;
				}
			
				}
			
				
		
		public static void insert_val(link node )
		{
			node=start;
			Scanner sc=new Scanner(System.in);
			link curr=new link();
			System.out.println(" enter the value of the current node ");
			curr.info=sc.nextInt();
			System.out.println(" enter the value after which you want to put the current value ");
			int val=sc.nextInt();
			
			
			while (( node!=null)&&(node.info!=val))
			{
				node=node.next;
				
			}
			
			if(node==null)
			{
				System.out.println(" invalid ");
				return;
				
			}
			
			else
			{
				
				node.info=curr.info;
				curr.next=node;
				
				
			
			}
		}
			
		
		public static void del_beg(link node)
		{
			
			start=node.next;
			
		}
		
		
		public static void del_end(link node)
		{
			
			link ptr=new link();
			while(node.next!=null)
			{
				ptr=node;
				node=node.next;
			}
			
			ptr.next=null;
		}
		
		
		public static  void del_at_loc(link node)
		{
		
			Scanner sc=new Scanner(System.in);
			int c=1;
			link ptr=new link();
			link curr=new link();
			//System.out.println(" enter the value of the current node ");
			//curr.info=sc.nextInt();
			System.out.println(" enter the location ");
			int loc=sc.nextInt();
			
			
			while((node!=null)&&(c<loc))
			{
				ptr=node;
				node=node.next;
				c++;
				
			}
			
			if (node==null)
			{
				System.out.println(" invalid input ");
				return;
			}
			
			if (loc==1)
			{
				curr.next=node;
				start=curr;
			}
				else
				{
					ptr.next=null;
					curr.next=node;
				}
			
				}
			
				
		 public static void  swap(link node)
		 {
			 
			 link temp=new link();
			 temp=node;
			 
			 while( node.next!=null)
			 {
				 
				 node=node.next;
			 }
				 int t=temp.info;
				 temp.info=node.info;
				 node.info=t;
				
				 
			 }
		 
		 
		 public static void reverse(link node)
		 {
			 
			 link ptr1=new link();
			 link ptr2=new link();
			 link ptr3=new link();
			 
			 ptr1=node;
			 ptr2=ptr1.next;
			 ptr1.next=null;
			 
			 while(ptr2.next!=null)
			 {
				 
				 ptr3=ptr2.next;
				 ptr2.next=ptr1;
				 ptr1=ptr2;
				 ptr2=ptr3;
				 
			 } 
			 
			 ptr2.next=ptr1;
			 start=ptr2;
			  
			 
		 }
		 
		 
		 
		
		 
		 
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		int ch;
		link node=new link();
		start=node;
		
		do
		{
			System.out.println("******************MENU***************");
			System.out.println(" 1)  create ");
			System.out.println(" 2)  display ");
			System.out.println(" 3)  create at the begining ");
			System.out.println(" 4)  create at the end ");
			System.out.println(" 5)  insertion of a node at a specific location ");
			System.out.println(" 6)  replacement of new node after a given node value  ");
			System.out.println(" 7)  deletion from the begining "); 
			System.out.println(" 8)  deletion from the end "); 
			System.out.println(" 9)  deletion after the specific location ");
			System.out.println(" 10) sorting of linked list ");
			System.out.println(" 11) swaping of first and last element "); 
			System.out.println(" 12) Reverse ");
			System.out.println(" 13) exit ");
			System.out.println(" ***********enter your choice********** ");
			
			
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:create(node);
				
			break;

			
			case 2:  node=start;
					display(node);
					break;
					
			case 3:insert_beg(node);
				break;
				
			case 4: insert_End(node);
			
				break;
				
			case 5:insert_loc(node);
			break;
			
			case 6: insert_val(node);
			break;
			
			case 7:del_beg(node);
			break;
			
			case 8:del_end(node);
			break;
			
			case 9:del_at_loc(node);
			break;
			case 10:sort(node);
			
			case 11:swap(node);
			
			break;
			
			case 12:node=start;
				reverse(node);
			break;
			
			
			}}
		while(ch!=13);}
		
			}