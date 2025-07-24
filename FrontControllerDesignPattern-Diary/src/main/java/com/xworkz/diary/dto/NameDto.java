package com.xworkz.diary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class NameDto
{
    private String firstName;
    private String lastName;
    private String middleName;
    private String displayName;
}
