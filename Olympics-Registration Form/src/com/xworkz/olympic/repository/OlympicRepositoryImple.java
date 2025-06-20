package com.xworkz.olympic.repository;

import com.xworkz.olympic.constant.DBProperties;
import com.xworkz.olympic.dto.OlympicDto;

import java.sql.*;
import java.util.Optional;

public class OlympicRepositoryImple implements OlympicRepository
{
    public OlympicRepositoryImple()
    {
        System.out.println("Running in the OlympicRepositoryImple");
    }
    @Override
    public boolean persist(OlympicDto dto) {
        System.out.println("running in persist in the OlympicRepositoryImple");
        if (dto != null) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
                String sql = "insert into register(MemberName,Dob,Gender,Phone,State,City,Sport,CreatedTime) values(?,?,?,?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, dto.getMemberName());
                statement.setString(2, dto.getDob());
                statement.setString(3, dto.getGender());
                statement.setString(4, dto.getPhone());
                statement.setString(5, dto.getState());
                statement.setString(6, dto.getCity());
                statement.setString(7, dto.getSport());

                statement.setTimestamp(8, dto.getCreatedTime());


                int result = statement.executeUpdate();

                if (result > 0) {
                    return true;
                }
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return false;
    }
    @Override
    public Optional<OlympicDto> findById(int OlympicId){
        System.out.println("running in findById in the OlympicRepositoryImple");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
            String findByIdSQL="select * from register  where id=?";
            System.out.println("findById :"+findByIdSQL);

            PreparedStatement statement = connection.prepareStatement(findByIdSQL);
            statement.setInt(1, OlympicId);

            ResultSet resultSet= statement.executeQuery();
            System.out.println("resultSet :"+resultSet);
            while(resultSet.next())
            {
                String Id= resultSet.getString(1);
                String MemberName=resultSet.getString(2);
                String Dob=resultSet.getString(3);
                String Gender=resultSet.getString(4);
                String Phone=resultSet.getString(5);
                String State=resultSet.getString(6);
                String City=resultSet.getString(7);
                String Sport=resultSet.getString(8);
                Timestamp Time=resultSet.getTimestamp(9);
                System.out.println("==========================================");


                OlympicDto dto = new OlympicDto(MemberName,Dob,Gender,Phone,State,City,Sport,Time);
                return  Optional.of(dto);
            }

        }
        catch (SQLException | ClassNotFoundException exception)
        {
            System.err.println("SQLException in findById "+exception.getMessage());
        }
        return Optional.empty();
    }
}

