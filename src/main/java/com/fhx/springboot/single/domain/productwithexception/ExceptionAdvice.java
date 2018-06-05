package com.fhx.springboot.single.domain.productwithexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(value = ProductWithException.class)
    private Map<String,Object> printException (ProductWithException ex) {
        Map<String,Object> map = new HashMap<>();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        return map;
    }
}
