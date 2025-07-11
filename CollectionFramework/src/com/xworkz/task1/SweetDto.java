package com.xworkz.task1;

import com.xworkz.in.dto.LaptopDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Objects;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class SweetDto implements Comparable<SweetDto> {
    private String name;
    private int price;
    private String[] ingredients;
    private int quantity;
    private int pack;

    @Override
    public int compareTo(SweetDto o) {


        SweetDto leftside=this;
        SweetDto rightside=o;
        if(leftside.price==rightside.price)
        {
            return 0;
        }
        else if(leftside.price>rightside.price)
        {
            return 99;
        }
        return -99;

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.ingredients);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running in equals method");
        if(obj!=null)
        {
            if(obj instanceof  SweetDto)
            {
                SweetDto casting=(SweetDto) obj;

                return Arrays.equals(this.ingredients, casting.ingredients);

            }
        }
        return false;
        
    }
}
