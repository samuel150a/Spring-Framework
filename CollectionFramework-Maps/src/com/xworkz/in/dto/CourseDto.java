package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CourseDto
{
    private Integer courseId;
    private String courseName;

    @Override
    public int hashCode() {
        return Objects.hashCode(courseName);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof CourseDto)
            {
                CourseDto casting=(CourseDto) obj;
                return this.courseId.equals(casting.courseId);

            }

        }
        return  false;
    }
}
