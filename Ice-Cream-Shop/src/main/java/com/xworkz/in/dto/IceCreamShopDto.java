package com.xworkz.in.dto;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class IceCreamShopDto {
    private String name;
    private String flavour;
    private int quantity;
    private String takeAway;
    private String addOn;
    private String coupon;
}

