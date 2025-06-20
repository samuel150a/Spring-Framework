package com.xworkz.olympic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Data
public class OlympicDto {






     String memberName;
     String dob;
     String gender;
     String phone;
     String state;
     String city;
     String sport;
     Timestamp createdTime = Timestamp.valueOf(LocalDateTime.now());


    public OlympicDto(String memberName, String dob, String gender, String phone, String state, String city, String sport) {
        this.memberName = memberName;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.state = state;
        this.city = city;
        this.sport = sport;
    }
}
