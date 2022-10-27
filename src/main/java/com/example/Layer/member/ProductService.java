package com.example.Layer.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    void save(Product product){
        productRepository.save(product);
    }
}
