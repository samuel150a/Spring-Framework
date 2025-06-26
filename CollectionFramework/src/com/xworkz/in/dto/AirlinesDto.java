package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class AirlinesDto
{

    private String name;
    private int ticketPrice;
    private String destination;
    private String airport;
    private boolean isTicketBooked;
}
