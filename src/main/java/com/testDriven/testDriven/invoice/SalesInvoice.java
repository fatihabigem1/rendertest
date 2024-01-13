package com.testDriven.testDriven.invoice;

public class SalesInvoice implements Invoice {

	@Override
	public String generateInvoice() {
		return "Generate sales invoice ";
	}

}
