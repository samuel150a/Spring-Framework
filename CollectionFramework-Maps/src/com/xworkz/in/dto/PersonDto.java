package com.xworkz.in.dto;

import lombok.*;

import java.util.HashSet;
import java.util.Objects;

@ToString
@Getter
@AllArgsConstructor
@Setter
public class PersonDto {
    private String name;
    private String email;
    private long aadhar;

    @Override
    public int hashCode() {

        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running in equals method");
        if(obj!=null){
            if(obj instanceof PersonDto)
            {
                PersonDto casting=(PersonDto) obj;
                return  this.email.equals(casting.email);
            }
        }
        return false;
    }
}
