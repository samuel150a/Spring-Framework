package com.xworkz.uniquejdbc.repository;

import com.xworkz.uniquejdbc.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class ContactRepoImple implements ContactRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean save(ContactDto dto) {
        String sql = "INSERT INTO contact_details VALUES (0, ?, ?, ?, ?, ?)";

        int rowsInserted = jdbcTemplate.update(
                sql,
                dto.getName(),
                dto.getEmail(),
                Long.parseLong(dto.getPhoneNumber()),
                dto.getComments(),
                LocalDateTime.now()
        );

        return rowsInserted > 0;
    }
}
