import java.util.Scanner;

class link
{
Scanner sc=new Scanner(System.in);
int info;
link first,last;
public void link()
{
first=NULL;
last=NULL;
}
public void insert_beg(link node)
{
link curr=new link();
System.out.println(" enter the value ");
curr.info=sc.nextInt();

first=curr;
curr.next=node;
node.prev=curr;
curr.prev=NULL;
}

public void insert_end(link node)
{
link curr=new link();
System.out.println(" enter the value ");
curr.info=sc.nextInt();

while(node.next!=NULL)
{
node=node.next;
}

node.next=curr;
curr.next=NULL;
curr.prev=node;
}

public void display(link node)
{
while(node!=NULL)
{
System.out.println(node.info+"->");
node=node.next;
}
}
}
public class dll
{
public static void main(String[] args)
{
link node=new link();
first=node;
node.insert_beg(node);
node=first;
node.display(node);
}
}
