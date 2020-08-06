import java.util.Scanner;
class Bank
{
int balance,deposit,with;
Scanner sc=new Scanner(System.in);
public void getdata(int deposit)
{
 //System.out.println(" Enter the money to be deposited ");
//deposit=sc.nextInt();
balance+=deposit;
}
public void withdrawl()
{
 System.out.println(" Enter the money to be withdrawl ?");
with=sc.nextInt();
balance=balance-with;
}
public void display()
{
System.out.println(" the available balance is "+ balance);
}}
class Bank_acc
{
public static void main(String[] args)
{
Bank b=new Bank();
Scanner sc=new Scanner(System.in);

b.getdata(1000);
b.withdrawl();
b.display();
}
}



