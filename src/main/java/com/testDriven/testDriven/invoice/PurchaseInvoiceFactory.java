package com.testDriven.testDriven.invoice;

public class PurchaseInvoiceFactory implements InvoiceFactory {

	@Override
	public Invoice createInvoice() {
		// TODO Auto-generated method stub
		return new PurchaseInvoice();
	}
	

}
