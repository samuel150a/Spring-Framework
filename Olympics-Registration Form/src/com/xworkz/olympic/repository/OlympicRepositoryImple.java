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
                Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(),DBProperties.USER_NAME.getProp(),DBProperties.SECRET.getProp());
                String sql = "insert into register values(0,'"+ dto.getMemberName()+ "','" + dto.getDob() + "','" + dto.getGender() + "','" + dto.getPhone() + "','" + dto.getState() + "','" + dto.getCity() + "','" + dto.getSport() + "')";
                Statement statement = connection.createStatement();

                statement.executeUpdate(sql);


            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
            return true;
        }
        return false;
    }

    @Override
    public Optional<OlympicDto> findById(int OlympicId) throws ClassNotFoundException, SQLException {
        System.out.println("running in findById in the OlympicRepositoryImple");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
            String findByIdSQL="select * from register  where id="+OlympicId+"";
            System.out.println("findById :"+findByIdSQL);
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(findByIdSQL);
            System.out.println("resultSet :"+resultSet);
            while(resultSet.next())
            {
                String Id= resultSet.getString("id");
                String MemberName=resultSet.getString("MemberName");
                String Dob=resultSet.getString("Dob");
                String Gender=resultSet.getString("Gender");
                String Phone=resultSet.getString("Phone");
                String State=resultSet.getString("State");
                String City=resultSet.getString("City");
                String Sport=resultSet.getString("Sport");

                OlympicDto dto = new OlympicDto(MemberName,Dob,Gender,Phone,State,City,Sport);
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

