package com.equals.task;

import java.util.Objects;

public class Mobile {
    private String madein;
    private int pixel;
    private String chargerpin;
    private boolean curved;

    void setmadein(String madein)
    {
        this.madein=madein;
    }

    void setpixel(int pixel)
    {
        this.pixel=pixel;
    }
    void setchargerpin(String chargerpin)
    {
        this.chargerpin=chargerpin;
    }

    void setcurved(boolean curved)
    {
        this.curved=curved;
    }






    String getmadein(String madein)
    {
        return madein;
    }

    int getpixel(int pixel)
    {
        return pixel;
    }


    String getchargerpin(String chargerpin)
    {
        return chargerpin;
    }

    boolean getcurved(boolean curved)
    {
       return curved;
    }
    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Mobile) {
            Mobile mobile = (Mobile) any;
            if (Objects.equals(this.madein, mobile.madein) &&
                    Objects.equals(this.pixel, mobile.pixel)
                    && Objects.equals(this.chargerpin, mobile.chargerpin)
                    && Objects.equals(this.curved, mobile.curved)) {
                System.out.println(" mobile is matched");
                return true;
            }
        }
        return false;

    }
    @Override
    public String toString()
    {
        return "madein " +this.madein+ " pixel " +this.pixel +" chargerpin "+this.chargerpin +" curved "+this.curved;
    }

}
