package com.fhx.springboot.single.domain.wellcom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomController {
    @GetMapping("/wellcom")
    public String sayWellcom () {
        return "wellcom";
    }
}
