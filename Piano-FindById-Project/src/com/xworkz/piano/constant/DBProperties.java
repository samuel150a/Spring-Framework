package com.xworkz.piano.constant;



public enum DBProperties {

    URL("jdbc:mysql://localhost:3306/find"),
    USER_NAME("root"),
    SECRET("Xworkz@123s"),
    VERSION_8;

    private String prop;

    private  DBProperties(String prop)
    {
        this.prop=prop;
    }
    private DBProperties()
    {

    }

    public String getProp() {
        return prop;
    }
}
