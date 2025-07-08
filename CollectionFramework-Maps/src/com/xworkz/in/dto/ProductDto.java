package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ProductDto {
    private String name;
    private String type;
    private int price;
    private int modelNo;
    private Integer id;

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Running in the equals method");
        if(obj!=null)
        {
            if(obj instanceof ProductDto)
            {
                ProductDto casting=(ProductDto) obj;
               return this.id.equals(casting.id);
            }

        }
        return false;
    }
}
