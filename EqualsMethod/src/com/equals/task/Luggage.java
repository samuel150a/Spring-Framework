package com.equals.task;

import java.util.Objects;

public class Luggage {
    private String Brand;
    private String Color;
    private int Counts;
    private String Owner;


    public Luggage(String Brand,String Color,int Counts,String Owner)
    {
        this.Brand=Brand;
        this.Color=Color;
        this.Counts=Counts;
        this.Owner=Owner;

        System.out.println("Running in the Luggage Constructor ");
    }
    @Override
    public boolean equals(Object every){
        if(every!=null && every instanceof Luggage)
        {
            Luggage luggage=(Luggage)every;
            if(Objects.equals(this.Color,luggage.Color)&&(Objects.equals(this.Brand,luggage.Brand))
                    &&(Objects.equals(this.Counts,luggage.Counts))&&(Objects.equals(this.Owner,luggage.Owner)))
            {
                System.out.println("Luggage is matching");
                return true;

            }

        }
        return false;

    }
    @Override
    public String toString()
    {
        return "Brand: "+this.Brand +" Color: "+this.Color +" Counts: "+this.Counts +" Ownwer: "+this.Owner;
    }



}