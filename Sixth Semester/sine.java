package Lab6;

import java.util.Scanner;

public class sine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,summ,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value for sine function = ");
		n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++){
	fact=fact*i;
	summ=n*i;
	sum=summ/fact;
	System.out.print(sum);
}
	}

}
