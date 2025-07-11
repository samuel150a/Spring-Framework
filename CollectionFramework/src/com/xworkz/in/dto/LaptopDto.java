package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class LaptopDto implements Comparable<LaptopDto> {
    private int cost;
    private String brand;
    private String color;
    private boolean istouchDisplay;
    private String proccessor;


    @Override
    public int compareTo(LaptopDto o) {


        LaptopDto leftside=this;
        LaptopDto rightside=o;
        if(leftside.cost==rightside.cost)
        {
            return 0;
        }
        else if(leftside.cost>rightside.cost)
        {
            return 99;
        }
        return -99;
    }
}
