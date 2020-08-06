package lab3;


	import java.util.Scanner;
	
	public class P11 {
	        static int gcd(int n,int m)
	        {
	                if(n%m==0) return m;
	                else return(gcd(m,n%m));
	                }
	        public static void main(String[] args) {
	                        Scanner s=new Scanner(System.in);
	                        System.out.println("Enter two numbers ");
	                        int n=s.nextInt();
	                        int m=s.nextInt();
	                        System.out.println("GCD="+gcd(n,m));
	        }
	}

