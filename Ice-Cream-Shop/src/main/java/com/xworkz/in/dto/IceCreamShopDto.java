package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/*12
*/
@Getter
@Setter
@ToString
@AllArgsConstructor
public class IceCreamShopDto {
    private String name;
    private String flavour;
    private int quantity;
    private String takeAway;
    private String addOn;
    private String coupon;
}

