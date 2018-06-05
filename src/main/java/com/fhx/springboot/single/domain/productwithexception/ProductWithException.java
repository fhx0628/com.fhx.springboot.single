package com.fhx.springboot.single.domain.productwithexception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
public class ProductWithException extends RuntimeException {
    private String code;
    private String msg;
}
