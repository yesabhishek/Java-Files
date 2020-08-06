package lab9;
import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
int i=0,n,fn,fnp1,k,sqfnp1,f2n,f2np1;
System.out.println("Enter the value of n ");
n=sc.nextInt();
int a[]=new int[10];
while(n>0){
	if(n%2==1){
		a[i]=1;}
		else{
			a[i]=0;
		}i++;
		n=n/2;
	}
	fn=0;fnp1=1;
	for(k=i-2;k>=0;k--){
		sqfnp1=fnp1*fnp1;
		f2n=fn*fn+sqfnp1;
		f2np1=(2*fnp1*fn)+sqfnp1;
		if(a[k]==0){
			fn=f2n;
			fnp1=f2np1;
		}
		else{
			fn=f2np1;
			fnp1=f2np1+f2n;
		}
	}
	System.out.println(fn);	
		}	
	}