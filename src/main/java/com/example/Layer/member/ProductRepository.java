package com.example.Layer.member;


import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    Map<Integer, Product> db = new HashMap<>(); //구연체



    void save(Product product){
        db.put(product.getPid(), product);
        System.out.println("저장되었습니다.");
    }

}
