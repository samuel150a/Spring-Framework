package com.xworkz.uniquejdbc.repository;

import com.xworkz.uniquejdbc.dto.ContactDto;

public interface ContactRepo {
    boolean save(ContactDto contactDTO);
}
