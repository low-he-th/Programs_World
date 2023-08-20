package banking;

import java.util.Scanner;

public class Banking {
	Scanner scan =new Scanner(System.in);
long accno;
String accHolderName;
int balance;

public Banking(long accno,String accHolderName,int balance) {
	this.accno=accno;
	this.accHolderName=accHolderName;
	this.balance=balance;
	
}
void  Deposit()
{
	System.out.println("enter the amount to be deposited ");
	int amt=scan.nextInt();
	System.out.println(amt+" amount is deposited to "+ accno +" succesufully");
	balance=amt+balance;
	System.out.println("total balance - "+ balance); 

	
}
void Widthdrawal() {
	System.out.println("enter the mount to be widthdrawed");
	int amt=scan.nextInt();
	if(amt<=balance) {
	System.out.println(amt+"amount is widthdrawed successfully");
    balance=balance-amt;
 System.out.println("balance remaining ="+balance);
}
	else
	{
		System.out.println("insuffient balace");
	}
}
void getbalance()
{
	System.out.println( " current balance = "+balance);
}

}
