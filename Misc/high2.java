//wap to create a simple array class which has different methods such as insert delete find and display. create the object of this class in simple array app.

import java.util.*;

class simple_array
{private int [] a;
 private int nelements;
 public void insert()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of elements: ");
  int n=sc.nextInt();
  System.out.println("Enter the elements: \n");
  for(int i=0;i<n;i++)
   { 
     a[nelements]=sc.nextInt();
	nelements++;
   }
  
  
 }

 public void insert1(int x)
 {
   
     a[nelements]=x;
	nelements++;
   
   
 }

public int Size()
{
 return nelements;
}

  
  public void display()
   {
   
  System.out.println("list of elements: \n");
  for(int i=0;i<nelements;i++)
   { 
     System.out.println(a[i]);
   }

  }

 public int find (int element)
   {
    int  c= 0;  
   for(int i=0;i<nelements;i++)
   { 
     if(a[i]==element)
	{
		c=1;
		break;     
	}
   }
	return c;
  }

 public int getmax ()
   {
    int  max= a[0];  
   for(int i=1;i<nelements;i++)
   { 
     if(a[i]>max)
     max=a[i];
  }

//System.out.println("Max = "+max);
delete(max);
return max;

//System.out.println("max element deleted");
	
}

public void delete (int element)
   { int del=0;
    if(find (element)==1)
 {   for(int i=0;i<nelements;i++)
   { 
     if(a[i]==element)
	{
		for(int j=i;j<nelements;j++)
		{
			a[j]=a[j+1];		
		}     
		
		del++;
		nelements--;
	}
	
   }
	
}

if(del==1)
{
//System.out.println("Delete Successful");
}
else
	{
	System.out.println("Delete failure");	
	}
  }

public simple_array(int max)
{
 a=new int[max];
 nelements=0;
}


}

 class high2
{
 public static void main(String[] args)
{
 simple_array obj=new simple_array(10);
 simple_array obj1=new simple_array(10);
 obj.insert();
System.out.println("Elements in obj: ");	
 obj.display();

int x=obj.Size();
int y;
 for(int i=0;i<5;i++)
{
 y=obj.getmax();
 obj1.insert1(y);
	
}



  
//obj.delete(5);
System.out.println("Elements in obj1: ");	

obj1.display();
System.out.println("Elements in obj: ");
obj.display();
}
}
