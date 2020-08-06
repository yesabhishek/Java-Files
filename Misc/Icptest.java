package programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Icptest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
int m=0,i=0;
int a[]=new int[10];
Scanner inFile=new Scanner(new FileReader("m.dat"));
while(inFile.hasNextInt()){
	m=inFile.nextInt();
	a[i]=m;
	i++;
}
for(int k=0;k<10;k++)
{
	System.out.println(a[k]);
	
}
int l=a[0],sl=a[0];
for(int j=0;j<10;j++)
{
	if(a[j]>l){
		sl=l;
		l=a[j];
		
		}
	else if(a[j]>sl)
	{
		sl=a[j];
	}
	
}
System.out.println("\n"+l+"\n"+sl);
	}

}
