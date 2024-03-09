package com.colak.springjpasqlloggingtutorial.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ProductRepositoryExistsTest {

    @Autowired
    private ProductRepository repository;

    @Test
    void testExists() {
        Assertions.assertTrue(repository.existsByName("Laptop"));
        Assertions.assertFalse(repository.existsByName("Laptopppp"));
    }

}
