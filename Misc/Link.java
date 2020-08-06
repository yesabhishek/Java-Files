package misc;

import java.util.Scanner;

class Link {
int info;
Link next;


public static class linkedlist{

	static Link start=null;
	
	
	public static void create(Link node){
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the value : ");
		node.info=null;
		System.out.println(" enter 1 to continue, 0 to exit : ");
	int	x=sc.nextInt();
	while(x!=0)
	{
		Link temp=new Link();
		System.out.println(" enter the value : ");
		temp.info=temp;
		temp next=null;
		node=temp;
		System.out.println(" enter 1 to continue , o to exit ");
		x=sc.nextInt();
		
		
		
	}
		
	}
	public static void display(Link node){
		while(node!=null)
		{
			System.out.println(  info+" -> ");
			node=node.next;
		}}
	
	public static void main()
	{
		Link node=new Link();
		start =node;
		create(node);
		node=start;
		display(node);
	}


		}
	}
