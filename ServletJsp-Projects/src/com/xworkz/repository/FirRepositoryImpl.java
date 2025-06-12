package com.xworkz.repository;

import com.xworkz.dto.FIRDto;
import com.xworkz.repository.FirRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirRepositoryImpl implements FirRepository {



    public FirRepositoryImpl()
    {
        System.out.println("FirRepositoryImpl constructor");
    }
    @Override
    public boolean persist(FIRDto firDto) {

        System.out.println(" persist method in FirRepositoryImpl");

        String username = "root";
        String password = "Xworkz@123s";
        String url = "jdbc:mysql://localhost:3306/xworkzz";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection= DriverManager.getConnection(url,username,password);

                String sql="insert into details values(0,'"+FIRDto.getpname()+"','"+FIRDto.getname()+"','"+FIRDto.getcomplaint()+"','"+FIRDto.getcity()+"')";
                Statement statement=connection.createStatement();

                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

            return true;
        }



    }
















