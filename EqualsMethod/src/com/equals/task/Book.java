package com.equals.task;

import java.util.Objects;

public class Book {
    private int pages;
    private String type;
    private int cost;
    private String shop;

     void setpages(int pages) {
        this.pages = pages;
    }

     void settype(String type) {
        this.type = type;
    }

     void setcost(int cost) {
        this.cost = cost;
    }

     void setshop(String shop) {
        this.shop = shop;
    }

     int getpages() {
        return pages;
    }


     String gettype() {
        return type;
    }

     int getcost() {
        return cost;
    }

    String getshop() {
        return shop;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Book) {
            Book book = (Book) any;
            if (Objects.equals(this.pages, book.pages) &&
                    Objects.equals(this.type, book.type)
                    && Objects.equals(this.cost, book.cost)
                    && Objects.equals(this.shop, book.shop)) {
                System.out.println(" book is matched");
                return true;
            }
        }
        return false;

    }
    @Override
             public String toString()
        {
            return "pages " +this.pages+ " type " +this.type +" cost "+this.cost +" shop "+this.shop;
        }

    }







