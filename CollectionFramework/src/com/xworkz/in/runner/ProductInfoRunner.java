package com.xworkz.in.runner;

import com.xworkz.in.dto.ProductInfoDto;
import com.xworkz.in.repository.ProductInfoRepository;
import com.xworkz.in.repository.ProductInfoRepositoryImple;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;
import static jdk.nashorn.internal.objects.NativeArray.map;

public class ProductInfoRunner {
    public static void main(String[] args) {

        ProductInfoRepository productInfoRepository = new ProductInfoRepositoryImple();
        Collection<ProductInfoDto> collection = productInfoRepository.findAll();
        System.out.println("-------------------------------- 1. Product info---------------------------------------");
        Iterator<ProductInfoDto> iterator = collection.iterator();

        while (iterator.hasNext()) {
            ProductInfoDto data = iterator.next();
            System.out.println("Details in List " + data);
        }


        System.out.println("**************************************************************");
        System.out.println(" ---------------------------------------- 2. Names:-------------------------------");
        collection.stream().map((names)-> names.getName()).forEach(System.out::println);
        System.out.println("________________ 3. Product Discount above 10 percentage______________________");
        collection.stream().filter((product)->product.getDiscount()>10).map(ProductInfoDto::getName).forEach(System.out::println);


        System.out.println("________________4. collect the Product warrenty less than 3yrs");
        collection.stream().filter((product)->product.getWarranty()<3).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(("**********************************************************************"));

        System.out.println("--------------------------------- 5. Sort all product by Id in ascending order-------------------------------------------------------");
        collection.stream().sorted().forEach(System.out::println);

        System.out.println("**********************************************************************************************************");
        System.out.println("------------------------------------- 6. collect the product if quantity>5 and sort by id---------------------------------------");
        collection.stream().filter((y)->y.getQuantity()>5).sorted().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("**********************************************************************************************************");
        System.out.println("--------------------------------------- 7. collect only manufacturer of all products----------------------------");
        collection.stream().map((z)->z.getManufacturer()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("**********************************************************************************************************");
        System.out.println("------------------------------------------------8. get the product with minimum discount--------------------");
        ProductInfoDto minsalary= collection.stream().min((a,b)->Integer.compare(a.getDiscount(),b.getDiscount())).get();
        System.out.println(minsalary);

        System.out.println("**********************************************************************************************************");
        System.out.println("------------------------------------------------9. get the product with latest manufacturing date--------------------");




        System.out.println("**********************************************************************************************************");
        System.out.println("------------------------------------------------10. get the product with max cost of item--------------------");
        ProductInfoDto MaxCost=collection.stream().max((k,l)->Integer.compare(k.getCostPerItem(),l.getCostPerItem())).get();
        System.out.println(MaxCost);









    }
}
