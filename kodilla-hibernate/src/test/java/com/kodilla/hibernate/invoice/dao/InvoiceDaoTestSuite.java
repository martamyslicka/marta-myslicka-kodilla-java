package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;


    private static final int PRICE = 120;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("628");

        Product product1 = new Product("Product 1");

        Item item1 = new Item(new BigDecimal(PRICE), 2);
        Item item2 = new Item(new BigDecimal(PRICE), 1);
        Item item3 = new Item(new BigDecimal(PRICE), 1);


        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();


        //Then
        assertNotEquals(0, invoiceId);


        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}