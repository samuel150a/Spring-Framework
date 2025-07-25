package com.xworkz.in.service;

import com.xworkz.in.dto.IceCreamShopDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IceCreamShopServiceImple implements IceCreamShopService {


    public IceCreamShopServiceImple() {
        System.out.println("Running int the IceCreamShopServiceImple constructor ");
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
        if (name != null || (name == "amul") || (name == "nandini")) {
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
        if(couponCode!=null)
        {
            List<String> couponList=couponList();
            boolean find =couponList.stream().anyMatch
                    (code->code.equals(couponCode));
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

        public List<String> couponList(){
        List<String> coupon=new ArrayList<>();
            coupon.add("Hi12");
            coupon.add("Hi13");
            coupon.add("Hi14");
            coupon.add("Hi15");
            return coupon;



    }
}
