package com.xworkz.in.repository;

import com.xworkz.in.dto.BrandDto;
import com.xworkz.in.dto.ComputerDto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ComputerBrandRepositoryImple implements ComputerBrandRepository {
    public  ComputerBrandRepositoryImple()
    {
        System.out.println("running in constructor ComputerBrandRepositoryImple");
    }
    @Override
    public Map<ComputerDto, BrandDto> findAll() {
        ComputerDto computerDto1 = new ComputerDto("LED", true, "Intel i5", true);
        ComputerDto computerDto2 = new ComputerDto("LCD", false, "AMD Ryzen 5", true);
        ComputerDto computerDto3 = new ComputerDto("OLED", true, "Intel i7", false);
        ComputerDto computerDto4 = new ComputerDto("Retina", true, "Apple M1", true);
        ComputerDto computerDto5 = new ComputerDto("IPS", false, "Intel i3", true);
        ComputerDto computerDto6 = new ComputerDto("AMOLED", true, "AMD Ryzen 7", false);
        ComputerDto computerDto7 = new ComputerDto("TN", false, "Intel Pentium", true);
        ComputerDto computerDto8 = new ComputerDto("LCD", true, "Intel Celeron", true);
        ComputerDto computerDto9 = new ComputerDto("LED", true, "Intel i9", false);
        ComputerDto computerDto10 = new ComputerDto("OLED", true, "AMD Ryzen 9", false);
        ComputerDto computerDto11 = new ComputerDto("Retina", true, "Apple M2", true);
        ComputerDto computerDto12 = new ComputerDto("AMOLED", true, "Intel i5", true);
        ComputerDto computerDto13 = new ComputerDto("IPS", false, "AMD Athlon", true);
        ComputerDto computerDto14 = new ComputerDto("TN", true, "Intel i7", false);
        ComputerDto computerDto15 = new ComputerDto("LED", true, "AMD Ryzen 3", true);
        ComputerDto computerDto16 = new ComputerDto("LCD", false, "Intel Xeon", false);
        ComputerDto computerDto17 = new ComputerDto("OLED", true, "Apple M3", true);
        ComputerDto computerDto18 = new ComputerDto("Retina", true, "Intel i9", false);
        ComputerDto computerDto19 = new ComputerDto("IPS", true, "Intel Core Duo", true);
        ComputerDto computerDto20 = new ComputerDto("AMOLED", true, "AMD FX", true);
        ComputerDto computerDto21 = new ComputerDto("LED", false, "Intel i5", true);
        ComputerDto computerDto22 = new ComputerDto("LCD", false, "AMD Ryzen 5", false);
        ComputerDto computerDto23 = new ComputerDto("OLED", true, "Intel i3", true);
        ComputerDto computerDto24 = new ComputerDto("Retina", false, "Apple M1", false);
        ComputerDto computerDto25 = new ComputerDto("TN", true, "Intel i7", true);

        BrandDto brandDto1 = new BrandDto("Dell", 55000, "India", "Charger");
        BrandDto brandDto2 = new BrandDto("HP", 60000, "USA", "Mouse");
        BrandDto brandDto3 = new BrandDto("Lenovo", 50000, "China", "Keyboard");
        BrandDto brandDto4 = new BrandDto("Asus", 58000, "Taiwan", "Cooling Pad");
        BrandDto brandDto5 = new BrandDto("Acer", 52000, "Malaysia", "Mouse Pad");
        BrandDto brandDto6 = new BrandDto("Apple", 120000, "USA", "Magic Mouse");
        BrandDto brandDto7 = new BrandDto("Samsung", 65000, "South Korea", "Stylus");
        BrandDto brandDto8 = new BrandDto("MSI", 70000, "Taiwan", "Gaming Mouse");
        BrandDto brandDto9 = new BrandDto("Sony", 68000, "Japan", "Headphones");
        BrandDto brandDto10 = new BrandDto("Toshiba", 48000, "Japan", "External HDD");
        BrandDto brandDto11 = new BrandDto("HCL", 40000, "India", "LAN Cable");
        BrandDto brandDto12 = new BrandDto("Compaq", 39000, "USA", "USB Cable");
        BrandDto brandDto13 = new BrandDto("iBall", 31000, "India", "Bluetooth Speaker");
        BrandDto brandDto14 = new BrandDto("Intex", 29500, "India", "Webcam");
        BrandDto brandDto15 = new BrandDto("Zebronics", 27000, "India", "USB Hub");
        BrandDto brandDto16 = new BrandDto("Micromax", 25000, "India", "Earphones");
        BrandDto brandDto17 = new BrandDto("LG", 61000, "South Korea", "Power Adapter");
        BrandDto brandDto18 = new BrandDto("Panasonic", 62000, "Japan", "Tripod Stand");
        BrandDto brandDto19 = new BrandDto("Fujitsu", 58000, "Germany", "Pen Drive");
        BrandDto brandDto20 = new BrandDto("Haier", 50000, "China", "USB Light");
        BrandDto brandDto21 = new BrandDto("Philips", 47000, "Netherlands", "Case Cover");
        BrandDto brandDto22 = new BrandDto("Huawei", 55000, "China", "Dongle");
        BrandDto brandDto23 = new BrandDto("Xiaomi", 49000, "China", "Mini Fan");
        BrandDto brandDto24 = new BrandDto("Realme", 51000, "India", "Back Cover");
        BrandDto brandDto25 = new BrandDto("Nokia", 53000, "Finland", "Charger");
Map<ComputerDto,BrandDto> map=new HashMap<>();
        map.put(computerDto1, brandDto1);
        map.put(computerDto2, brandDto2);
        map.put(computerDto3, brandDto3);
        map.put(computerDto4, brandDto4);
        map.put(computerDto5, brandDto5);
        map.put(computerDto6, brandDto6);
        map.put(computerDto7, brandDto7);
        map.put(computerDto8, brandDto8);
        map.put(computerDto9, brandDto9);
        map.put(computerDto10, brandDto10);
        map.put(computerDto11, brandDto11);
        map.put(computerDto12, brandDto12);
        map.put(computerDto13, brandDto13);
        map.put(computerDto14, brandDto14);
        map.put(computerDto15, brandDto15);
        map.put(computerDto16, brandDto16);
        map.put(computerDto17, brandDto17);
        map.put(computerDto18, brandDto18);
        map.put(computerDto19, brandDto19);
        map.put(computerDto20, brandDto20);
        map.put(computerDto21, brandDto21);
        map.put(computerDto22, brandDto22);
        map.put(computerDto23, brandDto23);
        map.put(computerDto24, brandDto24);
        map.put(computerDto25, brandDto25);
        return map;
    }
}
