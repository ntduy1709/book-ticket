package com.ifi.bookticket.dto;

import com.ifi.bookticket.model.EnumTicket;
import lombok.Data;

import java.sql.Date;

@Data
public class UserDTO {

    private int id;
    private String name;
    private String address;
    private String idCard;
    private String doB;
    private String typeOfClass;
    private int payment;
}
