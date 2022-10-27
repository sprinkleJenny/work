package com.example.Layer.member;

import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

//@RestController
@Controller
public class ProductController {
    ProductService productService;

    ProductController(ProductService productService){

        this.productService = productService;
    }

    @GetMapping("/create1")
    String create1(){
        Product product = new Product(111,"ipad");          //가짜 객체
        productService.save(product);   // 객체 전달
        return "saved";
    }
    @GetMapping("/lookup")
    String lookup(){
        Product product = new Product(111, "ipad");
        return "found";
    }

}
