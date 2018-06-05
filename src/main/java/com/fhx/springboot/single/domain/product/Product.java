package com.fhx.springboot.single.domain.product;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Table(name = "product")
public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "product id")
    private Long id;

//    @Column(name = "name")
    @ApiModelProperty(notes = "name of product")
    private String name;

//    @Column(name = "price")
    @ApiModelProperty(notes = "price of product")
    private Float price;

//    @Column(name = "description")
    @ApiModelProperty(notes = "The general description of product")
    private String description;
}
