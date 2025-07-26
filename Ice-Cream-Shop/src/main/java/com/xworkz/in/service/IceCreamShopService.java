package com.xworkz.in.service;

import com.xworkz.in.dto.IceCreamShopDto;

public interface IceCreamShopService {
    boolean verify(IceCreamShopDto iceCreamShopDto);
    double getPrice(String flavour,int quantity);
}
