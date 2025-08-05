package com.xworkz.uniquejdbc.service;

import com.xworkz.uniquejdbc.dto.ContactDto;

public interface ContactService {
    boolean validate(ContactDto contactDTO);
}
