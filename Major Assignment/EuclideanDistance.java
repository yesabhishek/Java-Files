/* Name :ABHISHEK CHOUDHURY

Branch : CSIT 'A'
Reg no : 1641017076
*/
package majorass;
import java.util.*;
public class EuclideanDistance
{
	EuclideanDistance() 
	{
		System.out.println("Created a EuclideanDistance Object");
	}

public double calculateEuclideanDistance(int x1, int y1, int x2, int y2)
{
	SimpleCalculator ob=new SimpleCalculator();
	double diff1=ob.subtractionSimple(x1,x2);
	double diff2=ob.subtractionSimple(y1,y2);
	double sum=diff1*diff1+diff2*diff2;
	double dist=ob.squarerootSimple(sum);
	return dist;
		
	}

	
	public static void main(String[] args)
	{
		int x1, y1, x2, y2;
		EuclideanDistance obj=new EuclideanDistance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 co-ordinates of which you want to find distance:");
		System.out.println("Enter x and y co-ordinates of the first point");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter x and y co-ordinates of the second point");
		x2=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("Distance between the points is "+obj.calculateEuclideanDistance(x1, y1, x2, y2));
		

	}

}
