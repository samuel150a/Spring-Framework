package com.xworkz.hotelmanagement.service;

import com.xworkz.hotelmanagement.entity.HotelEntity;
import com.xworkz.hotelmanagement.repository.HotelRepo;
import com.xworkz.hotelmanagement.repository.HotelRepoImple;

import java.util.Collections;
import java.util.List;

public class HotelServiceImple implements HotelService {
    HotelRepo hotelRepo = new HotelRepoImple();

    @Override
    public HotelEntity validation(HotelEntity en) {
        System.out.println("running in the validation method");
        if (en != null) {
            if (en.getDish() != null && en.getPrice() != null && en.getPrice() < 1000) {
                hotelRepo.savedHotel(en);
            }
        }
        return null;
    }

    @Override
    public void savedHotel(HotelEntity entity) {
        validation(entity);
    }

    @Override
    public HotelEntity readHotel(HotelEntity entity) {
        return hotelRepo.readHotel(entity);
    }

    @Override
    public HotelEntity updateHotel(HotelEntity entity) {
        return hotelRepo.updateHotel(entity);
    }

    @Override
    public HotelEntity deleteHotel(HotelEntity entity) {
        return hotelRepo.deleteHotel(entity);
    }

    @Override
    public HotelEntity getHotelEntityByName(String name) {
        return hotelRepo.getHotelEntityByName(name);
    }





    @Override
    public HotelEntity getHotelEntityByBill(boolean bill) {
        return hotelRepo.getHotelEntityByBill(bill);
    }

    @Override
    public HotelEntity getHotelEntityByFeedback(String feedback) {
        return hotelRepo.getHotelEntityByFeedback(feedback);
    }
    @Override
    public List<HotelEntity> getHotelEntityByDish(String dish) {
        return hotelRepo.getHotelEntityByDish(dish);
    }


    @Override
    public List<HotelEntity> getHotelEntityByPrice(Integer price) {
        return hotelRepo.getHotelEntityByPrice(price);
    }
}
