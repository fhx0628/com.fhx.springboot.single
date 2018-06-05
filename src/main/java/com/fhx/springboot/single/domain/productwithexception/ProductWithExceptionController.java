package com.fhx.springboot.single.domain.productwithexception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductWithExceptionController {
    @GetMapping("/product/exception")
    public void sendProductWithExceptionMsg () {
        throw new ProductWithException("ED1-1hd1", "Cannot find production");
    }
}
