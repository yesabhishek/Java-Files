package misc;

import java.util.Scanner;

class Letters {

	public static void main(String[] args) 
	{
		String ten=null;
		String one = null;
		int tens;
		int ones;
		String h=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the one's digit : ");
		ones=sc.nextInt();
		System.out.println(" enter the tens's digit : ");
		tens=sc.nextInt();
		System.out.println(" enter the hundreds digit : ");
		int hun=sc.nextInt();
		
		if(ones==0)
			one="zero";
		else if(ones ==1)
			one="one";
		else if(ones ==2)
			one="two";
		else if(ones ==3)
			one="three";
		else if(ones ==4)
			one="four";
		else if(ones ==5)
			one="five";
		else if(ones ==6)
			one="six";
		else if(ones ==7)
			one="seven";
		else if(ones ==8)
			one="eight";
		else if(ones ==9)
			one="nine";
		
		if(tens==0)
			ten="zero";
		else if(tens ==1)
			ten="one";
		else if(tens ==2)
			ten="twenty";
		else if(tens ==3)
			ten="thirty";
		else if(tens ==4)
			ten="fourty";
		else if(tens ==5)
			ten="fifty";
		else if(tens ==6)
			ten="sixty";
		else if(tens ==7)
			ten="seventy";
		else if(tens ==8)
			ten="eighty";
		else if(tens ==9)
			ten="ninety";
		
		
		if(hun==0)
			one="zero";
		else if(hun ==1)
			h="one hundred and";
		else if(hun ==2)
			h="two hundred and";
		else if(hun ==3)
			h="three hundred and";
		else if(hun ==4)
			h="four hundred and";
		else if(hun ==5)
			h="five hundred and";
		else if(hun ==6)
			h="six hundred and";
		else if(hun ==7)
			h="seven hundred and";
		else if(hun ==8)
			h="eight hundred and";
		else if(hun ==9)
			h="nine hundred and";


		
		System.out.println(h+" "+ten+" "+ one);
		
		
		
		
		

		
		
	}

}
