package com.colak.springjpasqlloggingtutorial.repository;

import com.colak.springjpasqlloggingtutorial.jpa.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // count keyword examples
    long countByName(String name);

    // exists keyword examples
    boolean existsByName(String name);

    // find keyword examples
    Optional<Product> findByName(String name);

    List<Product> findAllByPriceEquals(double price);

    //@Query examples
    @Query("SELECT p FROM Product p WHERE p.price > :threshold")
    List<Product> findProductsAbovePrice(@Param("threshold") int threshold);

}
