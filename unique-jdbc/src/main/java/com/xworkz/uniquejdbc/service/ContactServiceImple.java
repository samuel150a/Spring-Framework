package com.xworkz.uniquejdbc.service;

import com.xworkz.uniquejdbc.dto.ContactDto;
import com.xworkz.uniquejdbc.repository.ContactRepoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImple implements ContactService {

    @Autowired
    private ContactRepoImple contactRepositoryImpl;

    public ContactServiceImple() {
        System.out.println("ContactServiceImpl constructor");
    }

    @Override
    public boolean validate(ContactDto contactDTO) {
        if (contactDTO == null) {
            return false;
        }

        if (contactDTO.getName() == null || contactDTO.getName().length() < 3) {
            return false;
        }

        if (contactDTO.getEmail() == null || !contactDTO.getEmail().contains("@")) {
            return false;
        }

        if (contactDTO.getPhoneNumber() == null || contactDTO.getPhoneNumber().length() != 10) {
            return false;
        }

        if (contactDTO.getComments() == null || contactDTO.getComments().length() < 3) {
            return false;
        }

        return contactRepositoryImpl.save(contactDTO);
    }
}
