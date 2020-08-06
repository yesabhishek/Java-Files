package lab3;


	import java.util.*;
	public class P13 {
	           static int binary(int num){
	            if (num == 0) return 0;
	            else return(num % 2) + 10 * binary(num / 2);
	            }
	        public static void main(String[] args) {
	                int num, bin;
	                Scanner s=new Scanner(System.in);
	                System.out.println("Enter a decimal number: ");
	                num=s.nextInt();
	                bin = binary(num);
	                System.out.println("The binary equivalent of "+num+ " is "+bin);
	        }
}
