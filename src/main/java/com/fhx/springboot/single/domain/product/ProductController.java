package com.fhx.springboot.single.domain.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.rmi.PortableRemoteObject;

@RestController
public class ProductController {
    @GetMapping("/product/{id}")
    public Product getProductById (@PathVariable Long id) {
        return new Product(1l,"鸡蛋",1.00f,"白玉鸡产的蛋");
    }
}
