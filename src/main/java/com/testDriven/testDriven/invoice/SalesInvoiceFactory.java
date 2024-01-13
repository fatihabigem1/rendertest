package com.testDriven.testDriven.invoice;

public class SalesInvoiceFactory implements InvoiceFactory {

	public Invoice createInvoice() {
		return new SalesInvoice();
	}
}
