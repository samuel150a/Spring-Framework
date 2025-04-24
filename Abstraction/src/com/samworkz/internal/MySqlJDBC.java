package com.samworkz.internal;

public class MySqlJDBC implements JDBC{
    @Override
    public void Save() {
        System.out.println("Running in the Save method after implementation ");
    }
}
