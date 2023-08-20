package TaxApp;

public class CalculateTax {
 double calculateTotalWithTax(double purchaseAmt,double tax)
{
	double Tax=purchaseAmt*tax;
  purchaseAmt=purchaseAmt+Tax;
	return purchaseAmt;
			
}
}
