package misc;




class Stacks {
	public interface stack <E>{
	int size();
	boolean isempty();
	void push(E e);
	E top();
	E pop();
	
	
		
	}
	
	public class arrayStack <E> implements stack <E>{
		public static final int capacity=100;
		private E[]data;
		private int t=-1;
		public arrayStack(){
			this(capacity);
			
		}
		public arrayStack(int capacity2) {
			data=(E[])new Object[capacity];
			
		}
		public int size(){ return(t+1);
		
		}
		
		public boolean isempty(){return(t==-1);}
		public void push( E e)throws IllegalStateException {
		
			if(size()==data.length)throw new IllegalStateException(" Stackis full");
			data[++t]=e;
			
			
		}
		
		public E top(){
			if(isempty())return null;
			return data[t];
		}
		
		public E pop(){
			if(isempty())return null;
			E answer=data[t];
			data[t]=null;
			t--;
			return answer;
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" enter the no to be pushed ");
Integer i=new integer()
	}

}
