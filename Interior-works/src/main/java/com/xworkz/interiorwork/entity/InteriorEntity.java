package com.xworkz.interiorwork.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Table(name="peacock")
@NamedQuery(name="findByName",query="select a from InteriorEntity a where a.shop='stores'")

public class InteriorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int ID;


    @Column(name="type")
    private String type;

    @Column(name="shop")
    private String shop;

    @Column(name="variety")
    private String variety;

    @Column(name="wood")
    private boolean wood;

    @Column(name="price")
    private int price;

    @Column(name="doordelivery")
    private String doordelivery;
}