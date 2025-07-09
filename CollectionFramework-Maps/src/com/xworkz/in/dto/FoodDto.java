package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class FoodDto {
    private Integer foodToken;
    private String foodName;

    @Override
    public int hashCode() {
        return Objects.hashCode(foodName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof FoodDto) {
                FoodDto casting = (FoodDto) obj;
                return this.foodToken.equals(casting.foodToken);

            }

        }
        return false;
    }
}
