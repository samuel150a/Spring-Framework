package com.xworkz.in.service;

import com.xworkz.in.controller.ExcelReader;
import com.xworkz.in.dto.IceCreamShopDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IceCreamShopServiceImple implements IceCreamShopService {
    private List<IceCreamShopDto> excelData;


    public IceCreamShopServiceImple() {
        System.out.println("Running int the IceCreamShopServiceImple constructor ");

        ExcelReader excelReader = new ExcelReader();
        this.excelData = excelReader.readIceCreamData("C:/Users/Samuel/Desktop/IceCreamData.xlsx");
        System.out.println("Loaded Excel Data: " + excelData);

    }
    @Override
    public boolean verify(IceCreamShopDto iceCreamShopDto) {
        System.out.println("verify method in the IceCreamShopServiceImple");



        if (iceCreamShopDto != null) {
            System.out.println("IceCreanDto is not null");
        } else {
            System.out.println("IceCreanDto is  null");

            return false;

        }


        String name = iceCreamShopDto.getName();
        if (name != null ) {
            System.out.println("The Ice is Valid ");

        } else {
            System.out.println("The Ice is not Valid ");


            return false;
        }


        String flavour = iceCreamShopDto.getFlavour();
        if (flavour == null ) {
            System.out.println("Flavour is Invalid");
            return false;
        } else {
            System.out.println("Flavour  is  valid");
        }

        int quantity = iceCreamShopDto.getQuantity();

        if (quantity <=0 || quantity >= 5) {
            System.out.println("quantity is not valid");
            return false;
        } else {
            System.out.println("quantity is valid");
        }


        String couponCode=iceCreamShopDto.getCoupon();
        if(couponCode!=null|couponCode=="")
        {
            List<String> couponList=couponList();
            boolean find =couponList.stream().anyMatch
                    (code->code.equals(couponCode)|code.equals(""));
            if(find) {
                System.out.println("code is valid");
            }
                else
                {
                    System.out.println("code is not present in list");
                    return false;
                }
            }
            else {
                System.out.println("coupon is invalid");
                return false;
            }
            System.out.println("coupon is valid");
            return true;
        }

        public List<String> couponList() {
            List<String> coupon = new ArrayList<>();
            coupon.add("Hi12");
            coupon.add("Hi13");
            coupon.add("Hi14");
            coupon.add("Hi15");
            coupon.add("");
            return coupon;



    }

    public double getPrice(String flavour,int quantity) {
        Map<String, Double> price = new HashMap<>();
        price.put("Pista", 40d);
        price.put("Chocolate", 41d);
        price.put("Vanilla", 42d);
        price.put("Oreo", 43d);
        price.put("Grapes", 44d);
        double baseprice = price.getOrDefault(flavour, 0.0);
        return baseprice * quantity;
    }
        @Override
        public double getDiscountedPrice(IceCreamShopDto dto) {
            double basePrice = getPrice(dto.getFlavour(), dto.getQuantity());
            double discount = 0.0;

            if ("yes".equalsIgnoreCase(dto.getTakeAway())) {
                discount += 5;
            }

            if ("yes".equalsIgnoreCase(dto.getAddOn())) {
                discount += 3;
            }

            String coupon = dto.getCoupon();
            if (coupon != null && coupon!="" && couponList().contains(coupon)) {
                discount += 4;
            }

            return basePrice - discount;
        }
    }



