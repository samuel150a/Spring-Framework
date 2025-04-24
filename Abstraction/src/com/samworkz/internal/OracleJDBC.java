package com.samworkz.internal;

public class OracleJDBC implements JDBC{
    @Override
    public void Save() {
        System.out.println("Running in the save method after implementation");
    }
}
