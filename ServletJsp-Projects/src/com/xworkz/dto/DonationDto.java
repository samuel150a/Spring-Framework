package com.xworkz.dto;

public class DonationDto {

     private String name;
    private String email;
    private String amount;
    private String org;

     public void setname(String name) {
         this.name = name;
     }

     public void setemail(String email) {
         this.email = email;
     }

     public void setamount(String amount) {
         this.amount = amount;
     }

     public void setorg(String org) {
         this.org = org;
     }

     public String getname()
     {
         return name;
     }

     public String getemail()
     {
         return email;
     }

     public String getamount()
     {
         return amount;
     }

     public String getorg()
     {
         return org;
     }
 }
