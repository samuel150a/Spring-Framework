package com.xworkz.diary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class FruitDto {

    private String fruitName;
    private String isRaw;
    private int cost;
    private String isHealthy;
    private String isAvaiOnline;
    private String farmArea;
    private String grown;
    private boolean isSeedless;
    private String offer;
    private boolean isDamaged;
}
