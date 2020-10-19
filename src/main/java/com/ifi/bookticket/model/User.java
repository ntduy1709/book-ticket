package com.ifi.bookticket.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "IDcard")
    private int idCard;

    @Column(name = "DoB")
    private Date doB;

    @Column(name = "class")
    private EnumTicket typeOfClass;

    @Column (name = "payment")
    private int payment;


}
