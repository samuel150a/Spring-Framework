package com.xworkz.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Set
@RequiredArgsConstructor
@Entity
@Table(name="product_info")
public class ProductEntity {

    @Id
    @GeneratedValue(stratedy= GenerationType.IDENTITY)

    @Column(name="product_id")
    private Integer productid;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_price")
    private Integer price;

    @Column(name="product_mfd")
    private Integer mfd;

    @Column(name="product_company")
    private String company;




}
