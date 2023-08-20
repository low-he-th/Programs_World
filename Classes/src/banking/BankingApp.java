package banking;

import java.util.Scanner;

/*Problem 4:
Create a class named BankAccount with attributes accountNumber, accountHolderName, and balance. Include methods to deposit and withdraw money from the account. Write a program to create an instance of the BankAccount class, perform some deposit and withdrawal operations, and display the final balance.*/
public class BankingApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the Acc number");
	long accno=scan.nextLong();
	System.out.println("enter the account holder name");
	String accHolderName=scan.next();
	System.out.println("enter the acc balance");
	int balance=scan.nextInt();
Banking	b=new Banking(accno, accHolderName, balance);
System.out.println("account number- "+b.accno);
System.out.println("Account holder name - "+b.accHolderName);
System.out.println("Account balance- "+b.balance);

b.Deposit();

b.Widthdrawal();

b.getbalance();
	
}
}
