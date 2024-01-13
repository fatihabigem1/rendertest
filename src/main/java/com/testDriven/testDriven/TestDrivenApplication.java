package com.testDriven.testDriven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.testDriven.testDriven.invoice.InvoiceFactory;
import com.testDriven.testDriven.invoice.PurchaseInvoiceFactory;
import com.testDriven.testDriven.invoice.SalesInvoiceFactory;

@SpringBootApplication
public class TestDrivenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDrivenApplication.class, args);
	}
	
	@Bean
    public InvoiceFactory purchaseInvoiceFactory() {
        return new PurchaseInvoiceFactory();
    }

    @Bean
    public InvoiceFactory salesInvoiceFactory() {
        return new SalesInvoiceFactory();
    }

}
