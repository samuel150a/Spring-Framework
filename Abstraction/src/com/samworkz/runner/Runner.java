package com.samworkz.runner;

import com.samworkz.internal.IplApp;
import com.samworkz.internal.JDBC;
import com.samworkz.internal.MySqlJDBC;
import com.samworkz.internal.OracleJDBC;

public class Runner {
    public static void main(String[] args) {
        JDBC jdbc=new MySqlJDBC();
        jdbc.Save();

        JDBC jdbc1=new OracleJDBC();
        jdbc1.Save();

        IplApp iplApp=new IplApp(jdbc);
        iplApp.Details();
    }
}
