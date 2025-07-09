package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class ComputerDto {
    private String display;
    private boolean speaker;
    private String processor;
    private boolean costefficient;

    @Override
    public int hashCode() {
        return Objects.hashCode(processor);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Running in equals method");
        if (obj != null) {
            if (obj instanceof ComputerDto) {
                ComputerDto casting = (ComputerDto) obj;
                return this.display.equals(casting.display);

            }

        }
        return false;

    }
}