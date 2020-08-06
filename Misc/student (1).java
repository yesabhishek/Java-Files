import java.util.Scanner;

class alpha
{
String name,college_name;
int regd_no;

public alpha( String x,String y, int z)
{
name=x;
college_name=y;
regd_no=z;
}
public void display()
{
System.out.println(" the name of the student is "+ name);
System.out.println(" the name of the college is "+college_name);
System.out.println(" the registration no is "+regd_no);
}
}
class student
{
public static void main(String[] args)
{
alpha s=new alpha("raj","rajeshwari",100);
s.display();
}}
