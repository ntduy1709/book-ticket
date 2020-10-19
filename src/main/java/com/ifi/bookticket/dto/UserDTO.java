package com.ifi.bookticket.dto;

import com.ifi.bookticket.model.EnumTicket;
import lombok.Data;

import java.sql.Date;

@Data
public class UserDTO {

    private int id;
    private String name;
    private String address;
    private int idCard;
    private Date doB;
    private EnumTicket typeOfClass;
    private int payment;
}
