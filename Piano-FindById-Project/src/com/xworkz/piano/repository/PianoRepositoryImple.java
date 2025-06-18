package com.xworkz.piano.repository;

import com.xworkz.piano.constant.DBProperties;
import com.xworkz.piano.dto.PianoDto;

import java.sql.*;
import java.util.Optional;

public class PianoRepositoryImple implements PianoRepository {

    public PianoRepositoryImple() {
        System.out.println("Running in the PianoRepositoryImple constructor ");
    }

    @Override
    public boolean persist(PianoDto dto) {
        System.out.println("running in persist in the PianoRepositoryImple");
        if (dto != null) {



            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(),DBProperties.USER_NAME.getProp(),DBProperties.SECRET.getProp());
                String sql = "insert into s values(0,'" + dto.getCustomberName()+ "','" + dto.getModelName() + "','" + dto.getNoOfKeys() + "','" + dto.getPrice() + "','" + dto.getMemberShip() + "','" + dto.getManufactured() + "')";
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
    public Optional<PianoDto> findById(int PianoId) throws ClassNotFoundException, SQLException {
        System.out.println("running in findById in the PianoRepositoryImple");
try
{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
        String findByIdSQL="select * from s dust where dust.id="+PianoId+"";
        System.out.println("findById :"+findByIdSQL);
        Statement statement=connection.createStatement();
        ResultSet resultSet= statement.executeQuery(findByIdSQL);
        System.out.println("resultSet :"+resultSet);
        while(resultSet.next())
        {
            String Id= resultSet.getString("id");
            String CustomberName=resultSet.getString("CustomberName");
            String model=resultSet.getString("model");
            String NoOfKeys=resultSet.getString("NoOfKeys");
            String Price=resultSet.getString("Price");
            String MemberShip=resultSet.getString("MemberShip");
            String Manufactured=resultSet.getString("Manufactured");

            PianoDto dto = new PianoDto(CustomberName,model,NoOfKeys,Price,MemberShip,Manufactured);
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


