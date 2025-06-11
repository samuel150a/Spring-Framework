package com.xworkz.dto;

import com.xworkz.service.FeedBackService;

public class FeedBackServiceImple implements FeedBackService {
    public FeedBackServiceImple()
    {
        System.out.println("Running in the constructor FeedBackServiceImple ");
    }

    @Override
    public boolean save(FeedbackDto dto) {
        System.out.println("running in the save method");
        return true;
    }
}
