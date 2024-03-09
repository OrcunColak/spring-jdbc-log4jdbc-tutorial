package com.colak.springjpasqlloggingtutorial.repository;

import com.colak.springjpasqlloggingtutorial.jpa.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class ProductRepositoryQueryTest {


    @Autowired
    private ProductRepository repository;

    @Test
    void testExists() {
        List<Product> productsAbovePrice = repository.findProductsAbovePrice(200);
        Assertions.assertNotNull(productsAbovePrice);
        printPage(productsAbovePrice);
    }

    private void printPage(List<Product> list) {
        // Iterate over the products in the page
        for (Product product : list) {
            // Process each product as needed
            log.info("Product : {}", product);
        }
    }

}
