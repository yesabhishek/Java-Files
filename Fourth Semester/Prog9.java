package lab4;

public class Prog9 {

	public static void main(String[] args) {
		int s=0;int sq=0;int sqq=0;int j=0;
		// TODO Auto-generated method stub
for(int x=1;x<=10;x++){
	sq=(x*x);
	s+=sq;
}
for(int i=1;i<=10;i++){
 sqq+=i;
 j=sqq*sqq;
}
System.out.print(j-s);
	}


}