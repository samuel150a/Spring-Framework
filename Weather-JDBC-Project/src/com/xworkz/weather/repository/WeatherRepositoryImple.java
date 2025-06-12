package com.xworkz.weather.repository;

import com.xworkz.weather.dto.WeatherDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WeatherRepositoryImple implements WeatherRepository {

   public WeatherRepositoryImple() {
       System.out.println("running in the WeatherRepositoryImple constructor ");

   }


    @Override
    public boolean persist(WeatherDto dto) {

       System.out.println("persist method in WeatherRepositoryImple" );

        String username = "root";
        String password = "Xworkz@123s";
        String url = "jdbc:mysql://localhost:3306/xworkzz";



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection(url,username,password);

            String sql="insert into report values(0,'"+WeatherDto.getplaceName()+"','"+WeatherDto.getweather()+"','"+WeatherDto.getminTemp()+"','"+WeatherDto.getmaxTemp()+"','"+WeatherDto.getcloudy()+"','"+WeatherDto.getraining()+"','"+WeatherDto.getrain()+"','"+WeatherDto.gethumidity()+"','"+WeatherDto.getwindSpeed()+"','"+WeatherDto.getsunRiseTime()+"','"+WeatherDto.getsunSetTime()+"','"+WeatherDto.getmoonRiseTime()+"','"+WeatherDto.getmoonSetTime()+"','"+WeatherDto.getrainStartTime()+"','"+WeatherDto.getrainEndTime()+"','"+WeatherDto.getprecipitation()+"')";
            Statement statement=connection.createStatement();

            statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }



    }

