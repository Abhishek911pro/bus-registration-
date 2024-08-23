package com.busproject.bus_registration.busEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_table")
public class BusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id ;

    String userName;

    String userEmail;

    String userMobileNo;
}
