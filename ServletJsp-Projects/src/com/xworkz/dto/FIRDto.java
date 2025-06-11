package com.xworkz.dto;

public class FIRDto {

    private static String pname;
    private static String name;
    private static String complaint;
    private static String city;


    public void setpname(String pname) {

        this.pname = pname;
    }


    public void setname(String name) {

        this.name = name;
    }

    public void setcomplaint(String complaint) {

        this.complaint = complaint;
    }

    public void setcity(String city) {

        this.city = city;
    }


    public static String getpname() {
        return pname;
    }

    public static String getname() {
        return name;

    }

    public static String getcomplaint() {
        return complaint;

    }

    public static String getcity() {
        return city;
    }

    @Override
    public String toString() {
        return "FIRDto {" +
                "pname='" + pname + '\'' +
                ", name='" + name + '\'' +
                ", complaint='" + complaint + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
