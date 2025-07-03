package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Year;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class ProductInfoDto  implements  Comparable<ProductInfoDto>{


    private int id;
    private String name;
    private String type;
    private LocalDate manufactureDate;
    private String manufacturer;
    private  int costPerItem;
    private  int discount;
    private int quantity;
    private int warranty;

    @Override
    public int compareTo(ProductInfoDto o) {

        System.out.println("running camparablr to");
        ProductInfoDto leftSide=this;
        ProductInfoDto rightSide=o;
        if(leftSide.id==rightSide.id)
        {
            return 0;
        } else if (leftSide.id>rightSide.id)
        {

            return  99;
        }

        return -99;



    }
}
