package com.xworkz.in.repository;

import com.xworkz.in.dto.BagDetails;
import com.xworkz.in.dto.BagDto;

import java.util.HashMap;
import java.util.Map;

public class BagRepositoryImple implements BagRepository{
    public BagRepositoryImple()

    {
        System.out.println("Running in the constructor BagRepositoryImple");
    }    @Override
    public Map<BagDto, Map<Integer, String>> findAll() {

        BagDto bagDto1 = new BagDto(1, "RedBolt");
        BagDto bagDto2 = new BagDto(2, "SkyPack");
        BagDto bagDto3 = new BagDto(3, "MountainGear");
        BagDto bagDto4 = new BagDto(4, "UrbanTrack");
        BagDto bagDto5 = new BagDto(5, "WildCraft");
        BagDto bagDto6 = new BagDto(6, "FastTrack");
        BagDto bagDto7 = new BagDto(7, "PumaPack");
        BagDto bagDto8 = new BagDto(8, "NikeCarry");
        BagDto bagDto9 = new BagDto(9, "AdidasGear");
        BagDto bagDto10 = new BagDto(10, "RoadRunner");
        BagDto bagDto11 = new BagDto(11, "CampusBag");
        BagDto bagDto12 = new BagDto(12, "TravelMate");
        BagDto bagDto13 = new BagDto(13, "PowerPack");
        BagDto bagDto14 = new BagDto(14, "SmartCarry");
        BagDto bagDto15 = new BagDto(15, "ProBag");
        BagDto bagDto16 = new BagDto(16, "EdgeBag");
        BagDto bagDto17 = new BagDto(17, "SkyTrek");
        BagDto bagDto18 = new BagDto(18, "NovaCarry");
        BagDto bagDto19 = new BagDto(19, "JetPack");
        BagDto bagDto20 = new BagDto(20, "QuickMove");
        BagDto bagDto21 = new BagDto(21, "AirRider");
        BagDto bagDto22 = new BagDto(22, "ZipGo");
        BagDto bagDto23 = new BagDto(23, "TrekMaster");
        BagDto bagDto24 = new BagDto(24, "SwiftBag");
        BagDto bagDto25 = new BagDto(25, "BoltPro");

        BagDetails bagDetails1 = new BagDetails(132511, "red");
        BagDetails bagDetails2 = new BagDetails(132512, "blue");
        BagDetails bagDetails3 = new BagDetails(132513, "black");
        BagDetails bagDetails4 = new BagDetails(132514, "green");
        BagDetails bagDetails5 = new BagDetails(132515, "yellow");
        BagDetails bagDetails6 = new BagDetails(132516, "orange");
        BagDetails bagDetails7 = new BagDetails(132517, "grey");
        BagDetails bagDetails8 = new BagDetails(132518, "white");
        BagDetails bagDetails9 = new BagDetails(132519, "maroon");
        BagDetails bagDetails10 = new BagDetails(132520, "navy");
        BagDetails bagDetails11 = new BagDetails(132521, "pink");
        BagDetails bagDetails12 = new BagDetails(132522, "purple");
        BagDetails bagDetails13 = new BagDetails(132523, "brown");
        BagDetails bagDetails14 = new BagDetails(132524, "teal");
        BagDetails bagDetails15 = new BagDetails(132525, "gold");
        BagDetails bagDetails16 = new BagDetails(132526, "silver");
        BagDetails bagDetails17 = new BagDetails(132527, "cream");
        BagDetails bagDetails18 = new BagDetails(132528, "cyan");
        BagDetails bagDetails19 = new BagDetails(132529, "olive");
        BagDetails bagDetails20 = new BagDetails(132530, "beige");
        BagDetails bagDetails21 = new BagDetails(132531, "sky blue");
        BagDetails bagDetails22 = new BagDetails(132532, "indigo");
        BagDetails bagDetails23 = new BagDetails(132533, "violet");
        BagDetails bagDetails24 = new BagDetails(132534, "magenta");
        BagDetails bagDetails25 = new BagDetails(132535, "charcoal");


        Map<BagDto,Map<BagDetails,String>> map=new HashMap<>();
        map.put(bagDto1,bagDetails3);

    }
}
