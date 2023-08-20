package TaxApp;

import java.util.Scanner;

public class TaxApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the amount ");
	double purchaseAmt=scan.nextDouble();
	System.out.println("enter the tax rate ");
	double tax=scan.nextDouble();
	CalculateTax c=new CalculateTax();
	double res=c.calculateTotalWithTax(purchaseAmt, tax);
	System.out.println("Total cost including tax: "+res);
	}
}
