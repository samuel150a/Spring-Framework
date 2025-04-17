package com.xworkz.tostring;

public class Bag2 {
    private String brand;
    private  String color;


    public Bag2(String brand,String color) {
        System.out.println("Running in Bag2 constructor");

        this.brand=brand;
        this.color=color;

    }

    @Override
    public String toString() {
        return " brand " + this.brand +" color " +this.color;
    }
    //public void branddisp(){
     //   System.out.println("brand"+ this.brand+"color"+this.color);
    //}


}
