package com.xworkz.listee.dto;

import jdk.nashorn.internal.runtime.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ApplicationDto {



    private String name;
    private Version version;
    private LocalDate createdDate;
    private double size;
    private Type type;
    private boolean free;
    private double chargePerUser;


   public enum Version{
        V1_0,V2_0,V3_0,V4_0,
    }

    public enum Type{
        SOCIALMEDIA,COMMUNICATION,TRAVEL,FINANCE;
    }








}
