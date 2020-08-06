package lab3;

import java.util.Scanner;


	 
	public class P9 {
        static int r=0;
       public static int reverse(int n){
                if(n==0) return r;
        else {
                r=r*10+(n%10);
                return (reverse(n/10));
        }
}
       public static void main(String[] args) {
               System.out.println(reverse(1234));
       }
}