package com.xworkz.in.repository;

import com.xworkz.in.dto.ProductInfoDto;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductInfoRepositoryImple implements  ProductInfoRepository{

    public  ProductInfoRepositoryImple()
    {
        System.out.println("Running in the ProductInfoRepositoryImple constructor");
    }
    @Override
    public Collection<ProductInfoDto> findAll() {


        ProductInfoDto product1 = new ProductInfoDto(1, "Mobile", "Electronic", LocalDate.of(2005, 2, 12), "MadeInIndia", 25000, 20, 2, 1);
        ProductInfoDto product2 = new ProductInfoDto(2, "Laptop", "Electronic", LocalDate.of(2020, 6, 15), "Dell", 60000, 10, 5, 2);
        ProductInfoDto product3 = new ProductInfoDto(3, "Chair", "Furniture", LocalDate.of(2021, 8, 20), "Godrej", 3500, 5, 10, 3);
        ProductInfoDto product4 = new ProductInfoDto(4, "Washing Machine", "Appliance", LocalDate.of(2018, 1, 5), "LG", 30000, 15, 3, 4);
        ProductInfoDto product5 = new ProductInfoDto(5, "Notebook", "Stationery", LocalDate.of(2022, 9, 10), "Classmate", 50, 2, 100, 1);
        ProductInfoDto product6 = new ProductInfoDto(6, "Air Conditioner", "Electronic", LocalDate.of(2019, 4, 25), "Samsung", 45000, 18, 2, 2);
        ProductInfoDto product7 = new ProductInfoDto(7, "Headphones", "Accessory", LocalDate.of(2023, 3, 14), "Boat", 2000, 12, 4, 3);
        ProductInfoDto product8 = new ProductInfoDto(8, "Tablet", "Electronic", LocalDate.of(2023, 1, 1), "Apple", 50000, 8, 3, 4);
        ProductInfoDto product9 = new ProductInfoDto(9, "TV", "Appliance", LocalDate.of(2022, 5, 10), "Sony", 40000, 10, 1, 1);
        ProductInfoDto product10 = new ProductInfoDto(10, "Fridge", "Appliance", LocalDate.of(2020, 10, 12), "Whirlpool", 32000, 13, 2, 2);
        ProductInfoDto product11 = new ProductInfoDto(11, "Mouse", "Accessory", LocalDate.of(2022, 7, 22), "Logitech", 1500, 6, 8, 3);
        ProductInfoDto product12 = new ProductInfoDto(12, "Keyboard", "Accessory", LocalDate.of(2021, 11, 11), "HP", 2000, 7, 6, 4);
        ProductInfoDto product13 = new ProductInfoDto(13, "Smartwatch", "Accessory", LocalDate.of(2023, 6, 5), "Fossil", 10000, 11, 2, 1);
        ProductInfoDto product14 = new ProductInfoDto(14, "Fan", "Appliance", LocalDate.of(2021, 9, 1), "Usha", 2500, 4, 5, 2);
        ProductInfoDto product15 = new ProductInfoDto(15, "Desk", "Furniture", LocalDate.of(2020, 3, 3), "Ikea", 7000, 3, 2, 3);
        ProductInfoDto product16 = new ProductInfoDto(16, "Printer", "Electronic", LocalDate.of(2019, 7, 17), "Canon", 12000, 9, 2, 4);
        ProductInfoDto product17 = new ProductInfoDto(17, "Scanner", "Electronic", LocalDate.of(2022, 11, 9), "Epson", 8000, 6, 1, 1);
        ProductInfoDto product18 = new ProductInfoDto(18, "Projector", "Electronic", LocalDate.of(2021, 1, 25), "BenQ", 15000, 13, 1, 2);
        ProductInfoDto product19 = new ProductInfoDto(19, "Router", "Electronic", LocalDate.of(2020, 6, 18), "TP-Link", 2500, 4, 5, 3);
        ProductInfoDto product20 = new ProductInfoDto(20, "Modem", "Electronic", LocalDate.of(2019, 2, 20), "Netgear", 3000, 5, 3, 4);
        ProductInfoDto product21 = new ProductInfoDto(21, "Pen", "Stationery", LocalDate.of(2022, 4, 15), "Cello", 20, 2, 200, 1);
        ProductInfoDto product22 = new ProductInfoDto(22, "Pencil", "Stationery", LocalDate.of(2023, 2, 5), "Apsara", 10, 1, 500, 2);
        ProductInfoDto product23 = new ProductInfoDto(23, "Notebook", "Stationery", LocalDate.of(2021, 5, 10), "Navneet", 60, 3, 150, 3);
        ProductInfoDto product24 = new ProductInfoDto(24, "Bag", "Accessory", LocalDate.of(2022, 8, 25), "Skybags", 1500, 10, 10, 4);
        ProductInfoDto product25 = new ProductInfoDto(25, "Water Bottle", "Accessory", LocalDate.of(2023, 1, 15), "Milton", 500, 5, 30, 1);
        ProductInfoDto product26 = new ProductInfoDto(26, "Monitor", "Electronic", LocalDate.of(2021, 3, 28), "Dell", 18000, 8, 1, 2);
        ProductInfoDto product27 = new ProductInfoDto(27, "CPU", "Electronic", LocalDate.of(2020, 12, 30), "Intel", 25000, 14, 1, 3);
        ProductInfoDto product28 = new ProductInfoDto(28, "Graphics Card", "Electronic", LocalDate.of(2023, 4, 20), "NVIDIA", 70000, 18, 1, 4);
        ProductInfoDto product29 = new ProductInfoDto(29, "Speaker", "Accessory", LocalDate.of(2021, 7, 14), "JBL", 6000, 12, 3, 2);
        ProductInfoDto product30 = new ProductInfoDto(30, "Camera", "Electronic", LocalDate.of(2022, 10, 9), "Canon", 35000, 9, 1, 2);
        ProductInfoDto product31 = new ProductInfoDto(31, "Tripod", "Accessory", LocalDate.of(2023, 5, 7), "AmazonBasics", 1200, 5, 3, 1);
        ProductInfoDto product32 = new ProductInfoDto(32, "Lens", "Electronic", LocalDate.of(2022, 12, 1), "Sony", 45000, 10, 1, 3);
        ProductInfoDto product33 = new ProductInfoDto(33, "Microwave", "Appliance", LocalDate.of(2020, 11, 4), "IFB", 20000, 15, 2, 2);
        ProductInfoDto product34 = new ProductInfoDto(34, "Toaster", "Appliance", LocalDate.of(2019, 6, 13), "Philips", 2500, 5, 4, 1);
        ProductInfoDto product35 = new ProductInfoDto(35, "Oven", "Appliance", LocalDate.of(2021, 2, 27), "Bajaj", 10000, 6, 2, 2);
        ProductInfoDto product36 = new ProductInfoDto(36, "Vacuum Cleaner", "Appliance", LocalDate.of(2023, 6, 18), "Dyson", 50000, 12, 1, 2);
        ProductInfoDto product37 = new ProductInfoDto(37, "Gas Stove", "Appliance", LocalDate.of(2018, 10, 1), "Prestige", 4500, 7, 3, 2);
        ProductInfoDto product38 = new ProductInfoDto(38, "Mixer", "Appliance", LocalDate.of(2022, 7, 19), "Butterfly", 3000, 4, 5, 2);
        ProductInfoDto product39 = new ProductInfoDto(39, "Grinder", "Appliance", LocalDate.of(2021, 10, 30), "Preethi", 4000, 5, 2, 2);
        ProductInfoDto product40 = new ProductInfoDto(40, "Dishwasher", "Appliance", LocalDate.of(2023, 3, 3), "Bosch", 55000, 15, 1, 2);
        ProductInfoDto product41 = new ProductInfoDto(41, "Iron", "Appliance", LocalDate.of(2020, 5, 22), "Havells", 2200, 3, 4, 1);
        ProductInfoDto product42 = new ProductInfoDto(42, "Sewing Machine", "Appliance", LocalDate.of(2019, 11, 10), "Usha", 9000, 6, 2, 2);
        ProductInfoDto product43 = new ProductInfoDto(43, "Bluetooth Speaker", "Accessory", LocalDate.of(2022, 6, 6), "boAt", 4000, 9, 2, 2);
        ProductInfoDto product44 = new ProductInfoDto(44, "Smart Light", "Electronic", LocalDate.of(2023, 5, 12), "Philips Hue", 1800, 7, 3, 1);

        Collection<ProductInfoDto> collection = new ArrayList<>();

        collection.add(product1);
        collection.add(product2);
        collection.add(product3);
        collection.add(product4);
        collection.add(product5);
        collection.add(product6);
        collection.add(product7);
        collection.add(product8);
        collection.add(product9);
        collection.add(product10);
        collection.add(product11);
        collection.add(product12);
        collection.add(product13);
        collection.add(product14);
        collection.add(product15);
        collection.add(product16);
        collection.add(product17);
        collection.add(product18);
        collection.add(product19);
        collection.add(product20);
        collection.add(product21);
        collection.add(product22);
        collection.add(product23);
        collection.add(product24);
        collection.add(product25);
        collection.add(product26);
        collection.add(product27);
        collection.add(product28);
        collection.add(product29);
        collection.add(product30);
        collection.add(product31);
        collection.add(product32);
        collection.add(product33);
        collection.add(product34);
        collection.add(product35);
        collection.add(product36);
        collection.add(product37);
        collection.add(product38);
        collection.add(product39);
        collection.add(product40);
        collection.add(product41);
        collection.add(product42);
        collection.add(product43);
        collection.add(product44);

        return collection;
    }
}
