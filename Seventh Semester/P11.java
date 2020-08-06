package Lab8;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		P11 ap=new P11();
		int m=0,n=0,scd=0,scd1=0;
		System.out.println("enter the first no");
		m=sc.nextInt();
		System.out.println("enter the Second no. ");
		n=sc.nextInt();
		 scd=ap.add(m,n);
		System.out.println("The GCD is "+scd);
		System.out.println("The GCD is "+scd1);
			}
			int add(int m,int n)
			{
				int scd = 0,scd1 = 0;
				for(int i=2;i<=m;i++)
				{	
						if(m%i==0){scd=i;break;
				}
					for(int j=2;j<=n;j++){
						if(n%j==0){scd1=j;break;

			}
					}	
				
			       
					return scd;
			}
				return scd1;
			

				}}
