package com.xworkz.interiorwork.service;

import com.xworkz.interiorwork.entity.InteriorEntity;

public interface InteriorService {
    InteriorEntity validation(InteriorEntity en);
    public void savedInterior(InteriorEntity entity);
    public InteriorEntity readInterior(InteriorEntity entity);
    public InteriorEntity updateInterior(InteriorEntity entity);
    public InteriorEntity deleteInterior(InteriorEntity entity);
    public InteriorEntity getInteriorEntityByName();
}
