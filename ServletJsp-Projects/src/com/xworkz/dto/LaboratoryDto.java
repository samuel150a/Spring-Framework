package com.xworkz.dto;

public class LaboratoryDto {

    private String name;
    private String age;
    private String bloodgroup;
    private String bloodpressure;


    public void setname(String name) {
        this.name = name;
    }

    public void setage(String age) {
        this.age = age;
    }


    public void setbloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public void setbloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }


    public String getname()

    {
        return name;
    }

    public String getage()
    {
        return age;
    }

    public String getbloodgroup()
    {
        return bloodgroup;
    }

    public String getbloodpressure()
    {
        return bloodpressure;
    }

}
