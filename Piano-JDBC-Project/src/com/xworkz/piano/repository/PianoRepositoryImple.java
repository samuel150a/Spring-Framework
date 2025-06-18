package com.xworkz.piano.repository;

import com.xworkz.piano.dto.PianoDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class PianoRepositoryImple implements PianoRepository {

    public PianoRepositoryImple() {
        System.out.println("Running in the PianoRepositoryImple constructor ");
    }

    @Override
    public boolean persist(PianoDto dto) {
        System.out.println("running in persist in the PianoRepositoryImple");
        if (dto != null) {
            String username = "root";
            String password = "Xworkz@123s";
            String url = "jdbc:mysql://localhost:3306/xworkzz";


            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);
                String sql = "insert into dt values(0,'" + dto.getCustomberName()+ "','" + dto.getModelName() + "','" + dto.getNoOfKeys() + "','" + dto.getPrice() + "','" + dto.getMemberShip() + "','" + dto.getManufactured() + "')";
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
    public Optional<PianoDto> findById(int PianoId){
        System.out.println("running in findById in the PianoRepositoryImple");
        return PianoRepository.super.findById(PianoId);
    }
}
