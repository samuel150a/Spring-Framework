package com.xworkz.in.repository;

import com.xworkz.in.dto.ProductDto;
import com.xworkz.in.dto.VendorDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductVendorRepositoryImple implements ProductVendorRepository{
    public ProductVendorRepositoryImple()
    {
        System.out.println("running in the ProductVendorRepositoryImple constructor");
    }
    @Override
    public Map<ProductDto, VendorDto> findAll() {
        System.out.println("Running in the findAll method");
        ProductDto productDto1 = new ProductDto("WashingMachine", "washing", 45000, 56, 8);
        ProductDto productDto2 = new ProductDto("Refrigerator", "cooling", 60000, 42, 10);
        ProductDto productDto3 = new ProductDto("Microwave", "heating", 15000, 73, 5);
        ProductDto productDto4 = new ProductDto("Dishwasher", "cleaning", 35000, 31, 6);
        ProductDto productDto5 = new ProductDto("VacuumCleaner", "cleaning", 18000, 88, 4);
        ProductDto productDto6 = new ProductDto("AirConditioner", "cooling", 50000, 19, 9);
        ProductDto productDto7 = new ProductDto("Television", "entertainment", 40000, 60, 12);
        ProductDto productDto8 = new ProductDto("MixerGrinder", "kitchen", 7000, 120, 3);
        ProductDto productDto9 = new ProductDto("WaterHeater", "heating", 10000, 45, 6);
        ProductDto productDto10 = new ProductDto("Toaster", "kitchen", 2500, 67, 2);
        ProductDto productDto11 = new ProductDto("InductionCooker", "cooking", 5000, 53, 4);
        ProductDto productDto12 = new ProductDto("Geyser", "heating", 8500, 32, 5);
        ProductDto productDto13 = new ProductDto("Blender", "kitchen", 3200, 76, 2);
        ProductDto productDto14 = new ProductDto("Laptop", "electronics", 75000, 27, 12);
        ProductDto productDto15 = new ProductDto("Tablet", "electronics", 30000, 39, 8);
        ProductDto productDto16 = new ProductDto("Smartphone", "electronics", 40000, 91, 6);
        ProductDto productDto17 = new ProductDto("SmartWatch", "wearable", 15000, 34, 3);
        ProductDto productDto18 = new ProductDto("Speaker", "audio", 6000, 48, 2);
        ProductDto productDto19 = new ProductDto("Printer", "office", 12000, 25, 6);
        ProductDto productDto20 = new ProductDto("Scanner", "office", 9000, 13, 5);
        ProductDto productDto21 = new ProductDto("HairDryer", "personal", 4000, 77, 3);
        ProductDto productDto22 = new ProductDto("AirPurifier", "home", 22000, 21, 6);
        ProductDto productDto23 = new ProductDto("CCTV", "security", 15000, 40, 7);
        ProductDto productDto24 = new ProductDto("Router", "network", 3500, 85, 2);
        ProductDto productDto25 = new ProductDto("Inverter", "power", 18000, 17, 8);

        VendorDto vendorDto1 = new VendorDto("sukesh", 4528, LocalDate.of(2012, 2, 12));
        VendorDto vendorDto2 = new VendorDto("ramesh", 4529, LocalDate.of(2013, 3, 14));
        VendorDto vendorDto3 = new VendorDto("mahesh", 4530, LocalDate.of(2014, 5, 18));
        VendorDto vendorDto4 = new VendorDto("suresh", 4531, LocalDate.of(2015, 7, 20));
        VendorDto vendorDto5 = new VendorDto("naresh", 4532, LocalDate.of(2011, 9, 25));
        VendorDto vendorDto6 = new VendorDto("lokesh", 4533, LocalDate.of(2010, 11, 30));
        VendorDto vendorDto7 = new VendorDto("dinesh", 4534, LocalDate.of(2016, 1, 10));
        VendorDto vendorDto8 = new VendorDto("ganesh", 4535, LocalDate.of(2017, 4, 5));
        VendorDto vendorDto9 = new VendorDto("rajesh", 4536, LocalDate.of(2018, 6, 15));
        VendorDto vendorDto10 = new VendorDto("sunil", 4537, LocalDate.of(2019, 8, 22));
        VendorDto vendorDto11 = new VendorDto("anil", 4538, LocalDate.of(2020, 10, 28));
        VendorDto vendorDto12 = new VendorDto("manoj", 4539, LocalDate.of(2021, 12, 3));
        VendorDto vendorDto13 = new VendorDto("kiran", 4540, LocalDate.of(2022, 2, 14));
        VendorDto vendorDto14 = new VendorDto("vijay", 4541, LocalDate.of(2023, 3, 21));
        VendorDto vendorDto15 = new VendorDto("ajay", 4542, LocalDate.of(2011, 1, 7));
        VendorDto vendorDto16 = new VendorDto("deepak", 4543, LocalDate.of(2012, 4, 9));
        VendorDto vendorDto17 = new VendorDto("pavan", 4544, LocalDate.of(2013, 6, 11));
        VendorDto vendorDto18 = new VendorDto("yogesh", 4545, LocalDate.of(2014, 9, 13));
        VendorDto vendorDto19 = new VendorDto("arun", 4546, LocalDate.of(2015, 11, 17));
        VendorDto vendorDto20 = new VendorDto("tarun", 4547, LocalDate.of(2016, 5, 29));
        VendorDto vendorDto21 = new VendorDto("kishore", 4548, LocalDate.of(2017, 7, 8));
        VendorDto vendorDto22 = new VendorDto("naveen", 4549, LocalDate.of(2018, 10, 2));
        VendorDto vendorDto23 = new VendorDto("rohit", 4550, LocalDate.of(2019, 12, 19));
        VendorDto vendorDto24 = new VendorDto("chetan", 4551, LocalDate.of(2020, 3, 27));
        VendorDto vendorDto25 = new VendorDto("abhi", 4552, LocalDate.of(2021, 6, 6));

        Map<ProductDto,VendorDto> map= new HashMap<>();
        map.put(productDto1, vendorDto1);
        map.put(productDto2, vendorDto2);
        map.put(productDto3, vendorDto3);
        map.put(productDto4, vendorDto4);
        map.put(productDto5, vendorDto5);
        map.put(productDto6, vendorDto6);
        map.put(productDto7, vendorDto7);
        map.put(productDto8, vendorDto8);
        map.put(productDto9, vendorDto9);
        map.put(productDto10, vendorDto10);
        map.put(productDto11, vendorDto11);
        map.put(productDto12, vendorDto12);
        map.put(productDto13, vendorDto13);
        map.put(productDto14, vendorDto14);
        map.put(productDto15, vendorDto15);
        map.put(productDto16, vendorDto16);
        map.put(productDto17, vendorDto17);
        map.put(productDto18, vendorDto18);
        map.put(productDto19, vendorDto19);
        map.put(productDto20, vendorDto20);
        map.put(productDto21, vendorDto21);
        map.put(productDto22, vendorDto22);
        map.put(productDto23, vendorDto23);
        map.put(productDto24, vendorDto24);
        map.put(productDto25, vendorDto25);
return map;
    }
}
