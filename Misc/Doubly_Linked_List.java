import java.util.Scanner; 
 
class d_link
{ 
	int info;     
	d_link prv; 
	d_link next;  
}
public class Doubly_Linked_List 
{ 
	static d_link start=null;
	
	
public static void create(d_link node)  
{ 
	
	Scanner s=new Scanner(System.in);   
	int x; 
	System.out.println("Enter the value of node:"); 
	node.info=s.nextInt();  
	node.next=null;  
	node.prv=null;   
	System.out.println("Enter 1 to contiue and 0 to exit");   
	x=s.nextInt();   
	while(x!=0)  
	{
		
	d_link temp=new d_link();    
	System.out.println("Enter the value of node:");    
	temp.info=s.nextInt();   
	node.next=temp;   
	temp.prv=node;    
	temp.next=null;    
	node=temp;    
	System.out.println("Enter 1 to contiue and 0 to exit:");  
	x=s.nextInt();      
	
	} 
 
 } 

 
public static void insert_beg(d_link node)

{ 
	
	Scanner s=new Scanner(System.in);    
	d_link curr=new d_link();   
	System.out.println("Enter the current node value:");    
	curr.info=s.nextInt();
	curr.next=node;    
	node.prv=curr;    
	curr.prv=null;    
	start=curr;  
	
} 


public static void insert_end(d_link node)
 
 {  
	
	Scanner s=new Scanner(System.in);   
	d_link curr=new d_link();   
	System.out.println("Enter the current value:");   
	curr.info=s.nextInt();  
 
	while(node.next!=null)   
	
	{   
		node=node.next;   
		
	}   
	
	curr.next=null;   
	curr.prv=node;   
	node.next=curr;  
	
 } 
 
 public static void insert_loc(d_link node)
 
 
 {   
	 
	 Scanner s=new Scanner(System.in);   
	 int c=1;  
	 d_link curr=new d_link();  
	 d_link ptr=new d_link();   
	 System.out.println("Enter the vaalue of current node:");   
	 curr.info=s.nextInt();   
	 System.out.println("Enter the location:");   
	 int loc=s.nextInt();
	 
	 while(node!=null && loc<c)   
	 
	 {    
		 ptr=node;    
		 node=node.next;   
		 c++;   
		 
	 }  
	 
	 if(node==null)   
	 
	 {    
		 System.out.println("***INVAILD LOCATION****");    
		 return;      
		 
	 }   if(loc==1)   
	 
	 {    
		 
		 curr.next=node;   
		 node.prv=curr;    
		 curr.prv=null;    
		 start=curr;  
		 
	 }   
	 
	 else   
	 
	 {    
		 ptr.next=curr;    
		 curr.prv=ptr;    
		 curr.next=node;    
		 node.prv=curr;   
		 
	 }
	 
 } 
 


  public static void delete_beg(d_link node)//node=start
  
  {  
	  start=node.next;   
	  
	  if(node.next!=null)  
	  
	  {    
		  node.next.prv=null;   
		  
	  }  
	  
  }
  
  public static void delete_end(d_link node)
  
  {  
	  if(node.next==null)   
	  
	  {    
		  start=node.next;    
		  return;   
		  
	  } 
  
	  while(node.next!=null)   
	  {    
		  node=node.next;   
		  
	  }  
	  
  }
  
  public static void delete_loc(d_link node)//node=strat  
  {   
	  Scanner s=new Scanner(System.in);   
	  int c=1;  
	  d_link ptr=new d_link();   
	  System.out.println("Enter the location:");   
	  int loc=s.nextInt();  
	  while((node!=null) &&(c<loc))   
	  
	  {    
		  ptr=node;   
		  node=node.next;    
		  c++;    
		  
	  }   
	  
	  if(node==null)   
	  
	  {    
		  System.out.println("***INVAILD LOCATION****");   
		  return;  
		  
	  }    
	  
	  if(loc==1)  
	  
	  {   
		  start=node.next;   
		  while(node.next!=null)   
		  
		  {    
			  node.next=null;   
			  
		  }
		  
	  }  
	  
	  else 
	  {   
		  ptr.next=node.next;   
		  while(node.next!=null)   
		  
		  { 
   
			  node.prv=ptr;   
			  
		  }  
		  
	  }
	  
  }     
   public static void display(d_link node)  
   
   {   
	   d_link ptr=new d_link();   
	   System.out.println("In forward");   
	   while(node.next!=null)    
	   {   
		   System.out.print(node.info+"-->");    
		   ptr=node;    
		   node=node.next;    
		   
	   }  
	   
	   node=ptr;   
	   System.out.println("\n In backward");  
	   while(node!=null)   
	   
	   {   
		   System.out.print(node.info+"-->");    
		   node=node.prv;  
		   
	   }
	   
   }    
   
   public static void main(String[] args) 
   
   {  
	   d_link node=new d_link();   
	   start=node;   
	   int ch;   
	   
	   do   
	   
	   {  
		   Scanner s=new Scanner(System.in);   
		   System.out.println("\n");   
		   System.out.println("*****choice******");  
		   System.out.println("1.create:");   
		   System.out.println("2.Insert beginning:");   
		   System.out.println("3.Insert End:");   
		   System.out.println("4.location insert:");   
		   System.out.println("5.Delete beginning:");   
		   System.out.println("6.Delete end:");   
		   System.out.println("7.Location delete");   
		   System.out.println("8.display");   
		   System.out.println("9.Exit");   
		   System.out.println("Enter your choice:");  
		   ch=s.nextInt();   
		   
		   switch(ch)   
		   
		   {   
		   case 1:create(node);   
		   break;   
		   
		   case 2:insert_beg(node);  
		   break;   
		   
		   case 3:insert_end(node);   
		   break;   
		   
		   case 4:insert_loc(node);  
		   break; 
		   
  
		   case 5:delete_beg(node);   
		   break;   
		   
		   case 6:delete_end(node);   
		   break;  
		   
		   case 7:delete_loc(node);   
		   break;   
		   
		   case 8: node=start;   
		   display(node);   
		   break;   
		   
		   case 9:return;       
		   
		   }   
		   
	   }    
	   
	   while(ch!=9);   
	   
   }
   
} 
 
 
 
 