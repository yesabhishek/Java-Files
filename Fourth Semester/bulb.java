package lab4;

public class bulb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int state=1;
for(int i=1;i<=500;i++){
	if(i%2==0){state+=1;
	System.out.print(state+" ");}
	else
		state=state*0;
	
	System.out.print(state+" ");
	}

}}

