package com.xworkz.dto;

public class FeedbackDto
{
    private String name;
    private String college;
    private String webcourse;
    private String knowl;

    public void setname(String name) {
        this.name = name;
    }

    public void setcollege(String college) {
        this.college = college;
    }

    public void setwebcourse(String webcourse) {
        this.webcourse = webcourse;
    }

    public void setknowl(String knowl) {
        this.knowl = knowl;
    }

    public String getname()
    {
        return name;
    }


    public String getcollege()
    {
        return college;
    }

    public String getwebcourse()
    {
        return webcourse;
    }

    public String getknowl()
    {
        return knowl;
    }
}
