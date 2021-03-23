package com.example.onlineshopping.productservice.repository;

import com.example.onlineshopping.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String>
{

}
