package com.equals.task;

import java.util.Objects;

public class Lamp4 {
    private String company;
    private int cost;
    private String brought;
    private boolean portable;


    void setcompany(String company)
    {
        this.company=company;
    }


    void setcost(int cost)
    {
        this.cost=cost;
    }


    void setbrought(String brought)
    {
        this.brought=brought;
    }


    void setportable(boolean portable)
    {
        this.portable=portable;
    }


String getcompany()
{
    return company;
}

    int getcost()
    {
        return cost;
    }

    String getBrought()
    {
        return brought;
    }

    boolean getportable()
    {
        return portable;
    }



    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Lamp4) {
            Lamp4 lamp4 = (Lamp4) any;
            if (Objects.equals(this.company, lamp4.company)
                    && Objects.equals(this.cost, lamp4.cost)
                    && Objects.equals(this.brought, lamp4.brought)
                    && Objects.equals(this.portable, lamp4.portable)) {

                System.out.println("lamp is matched");
                return true;

            }
        }
        return false;
    }
        @Override
                public String toString()
        {
            return "company "+this.company+" cost "+this.cost+" brought "+this.brought+" portable "+portable;
        }

}
