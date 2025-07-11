package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.CustomerDto;
import com.xworkz.task2.dto.PasswordDto;

import java.util.LinkedList;
import java.util.List;

public class CustomerList {

        public CustomerList()
        {
            System.out.println("CustomerList constructor");
        }

        public List<CustomerDto> getCustomerList()
        {
            System.out.println("getCustomerList method in CustomerList");

            List<CustomerDto> list=new LinkedList<>();

            PasswordList passwordList=new PasswordList();
            List<PasswordDto> passwordGet = passwordList.getPasswordList();

            CustomerDto customerDto1 = new CustomerDto(1, "Arulmozhi", 34, passwordGet.get(0));
            CustomerDto customerDto2 = new CustomerDto(2, "Kaviyarasi", 29, passwordGet.get(1));
            CustomerDto customerDto3 = new CustomerDto(3, "Ilamparithi", 41, passwordGet.get(2));
            CustomerDto customerDto4 = new CustomerDto(4, "Nandhini", 25, passwordGet.get(3));
            CustomerDto customerDto5 = new CustomerDto(5, "Saravanan", 38, passwordGet.get(4));
            CustomerDto customerDto6 = new CustomerDto(6, "Tharani", 32, passwordGet.get(5));
            CustomerDto customerDto7 = new CustomerDto(7, "Vignesh", 27, passwordGet.get(6));
            CustomerDto customerDto8 = new CustomerDto(8, "Divya", 30, passwordGet.get(7));
            CustomerDto customerDto9 = new CustomerDto(9, "Karthik", 36, passwordGet.get(8));
            CustomerDto customerDto10 = new CustomerDto(10, "Meena", 33, passwordGet.get(9));
            CustomerDto customerDto11 = new CustomerDto(11, "Ramesh", 40, passwordGet.get(10));
            CustomerDto customerDto12 = new CustomerDto(12, "Priya", 24, passwordGet.get(11));
            CustomerDto customerDto13 = new CustomerDto(13, "Dinesh", 37, passwordGet.get(12));
            CustomerDto customerDto14 = new CustomerDto(14, "Anjali", 26, passwordGet.get(13));
            CustomerDto customerDto15 = new CustomerDto(15, "Sundar", 39, passwordGet.get(14));
            CustomerDto customerDto16 = new CustomerDto(16, "Revathi", 28, passwordGet.get(15));
            CustomerDto customerDto17 = new CustomerDto(17, "Manikandan", 35, passwordGet.get(16));
            CustomerDto customerDto18 = new CustomerDto(18, "Sneha", 31, passwordGet.get(17));
            CustomerDto customerDto19 = new CustomerDto(19, "Balaji", 42, passwordGet.get(18));
            CustomerDto customerDto20 = new CustomerDto(20, "Lakshmi", 29, passwordGet.get(19));
            CustomerDto customerDto21 = new CustomerDto(21, "Sathish", 33, passwordGet.get(20));
            CustomerDto customerDto22 = new CustomerDto(22, "Rajalakshmi", 45, passwordGet.get(21));
            CustomerDto customerDto23 = new CustomerDto(23, "Harish", 28, passwordGet.get(22));
            CustomerDto customerDto24 = new CustomerDto(24, "Deepa", 34, passwordGet.get(23));
            CustomerDto customerDto25 = new CustomerDto(25, "Prakash", 30, passwordGet.get(24));
            CustomerDto customerDto26 = new CustomerDto(26, "Mahalakshmi", 27, passwordGet.get(25));
            CustomerDto customerDto27 = new CustomerDto(27, "Ganesh", 39, passwordGet.get(26));
            CustomerDto customerDto28 = new CustomerDto(28, "Yamini", 26, passwordGet.get(27));
            CustomerDto customerDto29 = new CustomerDto(29, "Murugan", 41, passwordGet.get(28));
            CustomerDto customerDto30 = new CustomerDto(30, "Vasanthi", 36, passwordGet.get(29));




            list.add(customerDto1);
            list.add(customerDto2);
            list.add(customerDto3);
            list.add(customerDto4);
            list.add(customerDto5);
            list.add(customerDto6);
            list.add(customerDto7);
            list.add(customerDto8);
            list.add(customerDto9);
            list.add(customerDto10);
            list.add(customerDto11);
            list.add(customerDto12);
            list.add(customerDto13);
            list.add(customerDto14);
            list.add(customerDto15);
            list.add(customerDto16);
            list.add(customerDto17);
            list.add(customerDto18);
            list.add(customerDto19);
            list.add(customerDto20);
            list.add(customerDto21);
            list.add(customerDto22);
            list.add(customerDto23);
            list.add(customerDto24);
            list.add(customerDto25);
            list.add(customerDto26);
            list.add(customerDto27);
            list.add(customerDto28);
            list.add(customerDto29);
            list.add(customerDto30);


            return list;
        }
    }

