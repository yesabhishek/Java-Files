package misc;
class alpha{
	void display(){
		System.out.println("ITER");	
	}
}
 class beta extends alpha{
	 void print()
	 {
		 System.out.println("SOA");
		 
	 }
 }
class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
alpha a1=new beta();
a1.display();
beta b1=(beta)a1;
b1.display();
b1.print();

	}

}
